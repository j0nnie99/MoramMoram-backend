package kusitms.candoit.MoramMoramServer.global.Model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Status {
    SOCIAL_ADD_INFO_PLZ("추가 정보 요청"),
    SOCIAL_ADD_INFO_STAUTS_TRUE("추가 정보 요청 성공"),
    USER_DELETE_STATUS_TRUE("회원탈퇴 성공"),
    PROFILE_IMAGE_UPLOAD_TRUE("이미지 업로드 성공"),
    LOGOUT_TRUE("로그아웃 성공");
    private final String statusMessage;
}
