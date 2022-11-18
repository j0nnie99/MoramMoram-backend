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
@Table(name = "QuestionBoard")
public class QuestionBoard extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "questionBoardId")
    private Long questionBoardId;

    @Column(name = "userId", nullable = false)
    private Long userId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "title", length=100, nullable = false)
    private String title;

    @Column(name = "note",columnDefinition = "TEXT", nullable = false)
    private String note;

    @Column(name = "img", columnDefinition = "TEXT")
    private String img;

    @Column(name = "viewCnt")
    @ColumnDefault("0")
    private Integer viewCnt;

    @Column(name = "likeCnt")
    @ColumnDefault("0")
    private Integer likeCnt;

    @Column(name = "commentCnt")
    @ColumnDefault("0")
    private Integer commentCnt;

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

    public void updateLike(){this.likeCnt++;}

    public void updateViewCnt(){this.viewCnt++;}
}

