package kusitms.candoit.MoramMoramServer.domain.board.Dto;

import kusitms.candoit.MoramMoramServer.domain.board.Entity.QuestionBoard;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuestionReplyDTO {

    private Long questionReplyId;

    private QuestionBoard questionBoard;

    @NotNull
    private Long userId;
    @NotEmpty
    private String replyText;
    @NotEmpty
    private String replyer;

    private LocalDateTime createdAt, updatedAt;

    private String status;
}
