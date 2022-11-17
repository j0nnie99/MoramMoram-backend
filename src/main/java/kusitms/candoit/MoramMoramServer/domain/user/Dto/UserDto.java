package kusitms.candoit.MoramMoramServer.domain.user.Dto;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class UserDto implements Serializable {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class delete {
        private String pw;
    }

    @Getter
    @Builder
    public static class register {
        private Long id;
        private String name;
        private String email;
        private String pw;
        private String pnum;
        private String uimg;
        private Boolean maketing;
    }

    @Data
    @Builder
    public static class registerResponse {
        private final String name;
        private final String email;
        private final String atk;
        private final String rtk;

        public static registerResponse response(String name, String email, String atk, String rtk) {
            return registerResponse.builder()
                    .email(email)
                    .name(name)
                    .atk(atk)
                    .rtk(rtk)
                    .build();
        }
    }

    @Data
    @Builder
    public static class login {
        private final String pw;
        private final String email;
    }

    @Data
    @Builder
    public static class reissue {
        private final String pw;
        private final String email;
        private final String rtk;
    }

    @Data
    @Builder
    public static class loginResponse {
        private final String atk;
        private final String rtk;

        public static loginResponse response(String atk, String rtk) {
            return loginResponse.builder()
                    .atk(atk)
                    .rtk(rtk)
                    .build();
        }
    }

    @Data
    @Builder
    public static class socialLoginResponse {
        private final String status;
        private final String name;
        private final String email;
        private final String img;
        private final String atk;
        private final String rtk;

        public static socialLoginResponse response(String name, String email, String img, String atk, String rtk, String status) {
            return socialLoginResponse.builder()
                    .status(status)
                    .name(name)
                    .email(email)
                    .img(img)
                    .atk(atk)
                    .rtk(rtk)
                    .build();
        }
    }

    @Data
    @Builder
    public static class infoResponse {

        private final String name;
        private final String email;

        public static infoResponse response(@NotNull String name, @NotNull String email) {
            return infoResponse.builder()
                    .email(email)
                    .name(name)
                    .build();
        }
    }
}
