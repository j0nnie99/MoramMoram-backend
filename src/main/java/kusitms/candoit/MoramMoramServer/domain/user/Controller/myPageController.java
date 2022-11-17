package kusitms.candoit.MoramMoramServer.domain.user.Controller;

import kusitms.candoit.MoramMoramServer.domain.user.Dto.UserDto;
import kusitms.candoit.MoramMoramServer.domain.user.Service.myPageService;
import kusitms.candoit.MoramMoramServer.global.Model.Status;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class myPageController {

    private final myPageService myPageService;

    // 회원탈퇴
    @DeleteMapping("user")
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public ResponseEntity<Status> deleteUser(
            @RequestBody final UserDto.delete request
    ) {
        return myPageService.delete(request);
    }
}
