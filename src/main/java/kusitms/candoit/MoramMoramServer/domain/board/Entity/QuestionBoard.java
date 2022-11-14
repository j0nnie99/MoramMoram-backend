package kusitms.candoit.MoramMoramServer.domain.board.Entity;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@DynamicInsert
@DynamicUpdate
public class QuestionBoard extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long question_board_id;

    @Column(name = "user_id", nullable = false)
    private Long user_id;

    @Column(name = "title", length=100, nullable = false)
    private String title;

    @Column(name = "note",columnDefinition = "TEXT", nullable = false)
    private String note;

    @Column(name = "img", columnDefinition = "TEXT")
    private String img;

    @Column(name = "view_cnt")
    @ColumnDefault("0")
    private Integer view_cnt;

    @Column(name = "like_cnt")
    @ColumnDefault("0")
    private Integer like_cnt;

    @Column(name = "comment_cnt")
    @ColumnDefault("0")
    private Integer comment_cnt;

    //TODO default 값 지정
    @Column(name = "status", columnDefinition = "varchar(50) default 'ACTIVE'", nullable = false)
    private String status;

    public void changTitle(String title){
        this.title = title;
    }

    public void changeNote(String note){
        this.note = note;
    }
    public void changeImg(String img){
        this.img = img;
    }
}
