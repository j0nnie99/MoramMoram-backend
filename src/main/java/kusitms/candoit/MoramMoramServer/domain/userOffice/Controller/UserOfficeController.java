package kusitms.candoit.MoramMoramServer.domain.userOffice.Controller;

import kusitms.candoit.MoramMoramServer.domain.user.Dto.UserDto;
import kusitms.candoit.MoramMoramServer.domain.userOffice.Service.UserOfficeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserOfficeController {
    private final UserOfficeService userOfficeService;

    // 회원가입
    @PostMapping("company-user/sign-up")
    public ResponseEntity<UserDto.registerResponse> register(
            @RequestBody UserDto.officeRegister request
    ) {
        return userOfficeService.register(request);
    }

    @PostMapping("auth/company/login")
    public ResponseEntity<UserDto.loginResponse> login(
            @RequestBody UserDto.login request
    ) {
        return userOfficeService.login(request);
    }
}
