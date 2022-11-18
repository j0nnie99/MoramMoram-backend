package kusitms.candoit.MoramMoramServer.domain.user.Dto;

import kusitms.candoit.MoramMoramServer.domain.user.Entity.User;
import lombok.*;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class register {
        private Long id;
        private String name;
        private String email;
        private String pw;
        private String pnum;
        private String uimg;
        private Boolean marketing;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class officeRegister {
        private Long id;
        private String name;
        private String email;
        private String pw;
        private String pnum;
        private String uimg;
        private Boolean marketing;
        private String office_add;
        private String market_add;
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
        private Long id;
        private String name;
        private String email;
        private String pnum;
        private String uimg;
        private Boolean seller;
        private Integer report;
        private Boolean marketing;
        private String officeAdd;
        private String marketAdd;

        public static infoResponse response(@NotNull User user) {
            return infoResponse.builder()
                    .id(user.getId())
                    .name(user.getName())
                    .email(user.getEmail())
                    .pnum(user.getPnum())
                    .uimg(user.getUimg())
                    .seller(user.getSeller())
                    .report(user.getReport())
                    .marketing(user.getMarketing())
                    .officeAdd(user.getOfficeAdd())
                    .marketAdd(user.getMarketAdd())
                    .build();
        }
    }
}
