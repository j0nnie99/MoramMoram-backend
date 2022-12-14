package kusitms.candoit.MoramMoramServer.domain.user.Controller;

import kusitms.candoit.MoramMoramServer.domain.user.Dto.UserDto;
import kusitms.candoit.MoramMoramServer.domain.user.Service.UserService;
import kusitms.candoit.MoramMoramServer.global.Model.Status;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("app")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    // 로그인
    @PostMapping("auth/login")
    public ResponseEntity<UserDto.loginResponse> login(
            @RequestBody UserDto.login request
    ) {
        return userService.login(request);
    }

    // 회원가입
    @PostMapping("sign-up")
    public ResponseEntity<UserDto.registerResponse> register(
            @RequestBody UserDto.register request
    ) {
        return userService.register(request);
    }

    // 로그인 만료시 atk 재발급
    @GetMapping
    public ResponseEntity<UserDto.loginResponse> reissue(
            @RequestHeader(value = "REFRESH_TOKEN") String rtk
    ) {
        return userService.reissue(rtk);
    }

    // 로그아웃
    @PatchMapping("auth/logout")
    @PreAuthorize("hasAnyRole('ADMIN','USER','OFFICE')")
    public ResponseEntity<Status> logout(
            @RequestHeader(value = "Authorization") String auth
    ) {
        return userService.logout(auth);
    }
}
