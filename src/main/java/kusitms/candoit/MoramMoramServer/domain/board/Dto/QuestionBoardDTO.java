package kusitms.candoit.MoramMoramServer.domain.board.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuestionBoardDTO {

    private Long question_board_id;

    private Long user_id;

    private String title;

    private String note;

    private String img;

    private Integer view_cnt;

    private Integer like_cnt;

    private Integer comment_cnt;

    private String status;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;
}
