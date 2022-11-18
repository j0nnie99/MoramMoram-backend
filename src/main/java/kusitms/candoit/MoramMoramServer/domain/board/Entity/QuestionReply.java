package kusitms.candoit.MoramMoramServer.domain.board.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="QuestionReply")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "QuestionBoard")
public class QuestionReply extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionReplyId;

    @ManyToOne(fetch = FetchType.LAZY)
    private QuestionBoard questionBoard;

    @Column(name = "note",columnDefinition = "TEXT", nullable = false)
    private String replyText;

    @Column(name = "userId", nullable = false)
    private Long userId;

    @Column(name = "replyer", nullable = false)
    private String replyer;

    @Column(name = "status", columnDefinition = "varchar(50) default 'ACTIVE'", nullable = false)
    private String status;

}
