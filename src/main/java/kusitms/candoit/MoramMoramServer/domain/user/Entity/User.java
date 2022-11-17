package kusitms.candoit.MoramMoramServer.domain.user.Entity;

import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "user")
@EntityListeners(AuditingEntityListener.class)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 255)
    private String name;

    @NotNull
    @Size(min = 1, max = 255)
    private String email;

    @NotNull
    @Size(min = 1, max = 255)
    private String pw;

    @NotNull
    @Size(min = 1, max = 255)
    private String pnum;

    @Size(min = 1, max = 1000)
    private String uimg;

    @NotNull
    private Boolean seller;

    @NotNull
    private Integer report;

    @NotNull
    private Boolean marketing;

    @Column(name = "office_add")
    private String officeAdd;

    @Column(name = "market_add")
    private String marketAdd;

    @ManyToMany
    @JoinTable(
            name = "user_authority",
            joinColumns = {@JoinColumn(name = "id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "authority_name", referencedColumnName = "authority_name")})
    private Set<Authority> authorities;


}
