package kusitms.candoit.MoramMoramServer.domain.user.Service;

import kusitms.candoit.MoramMoramServer.domain.user.Dto.TokenInfoResponseDto;
import kusitms.candoit.MoramMoramServer.domain.user.Dto.UserDto;
import kusitms.candoit.MoramMoramServer.domain.user.Repository.UserRepository;
import kusitms.candoit.MoramMoramServer.global.Exception.CustomException;
import kusitms.candoit.MoramMoramServer.global.Model.Status;
import kusitms.candoit.MoramMoramServer.global.config.Jwt.SecurityUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

import static kusitms.candoit.MoramMoramServer.global.Exception.CustomErrorCode.USER_DELETE_STATUS_FALSE;
import static kusitms.candoit.MoramMoramServer.global.Model.Status.USER_DELETE_STATUS_TRUE;

@Service
@Slf4j
@RequiredArgsConstructor
public class myPageService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    private TokenInfoResponseDto getTokenInfo() {
        return TokenInfoResponseDto.Response(
                Objects.requireNonNull(SecurityUtil.getCurrentUsername()
                        .flatMap(
                                userRepository::findOneWithAuthoritiesByEmail)
                        .orElse(null))
        );
    }

    // 회원탈퇴
    @Transactional
    public ResponseEntity<Status> delete(UserDto.delete request) {
        if (!passwordEncoder.matches(request.getPw(), getTokenInfo().getPw())) {
            throw new CustomException(USER_DELETE_STATUS_FALSE);
        }
        userRepository.deleteById(getTokenInfo().getId());

        return new ResponseEntity<>(USER_DELETE_STATUS_TRUE, HttpStatus.OK);
    }

    // 회원 정보 보기
    public ResponseEntity<UserDto.infoResponse> read() {

        UserDto.infoResponse user = UserDto.infoResponse.response(
                userRepository.findByEmail(
                        SecurityContextHolder.getContext()
                                .getAuthentication()
                                .getName()
                ).orElseThrow(
                        NullPointerException::new
                )
        );

        return new ResponseEntity<>(user,HttpStatus.OK);
    }
}
