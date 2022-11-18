package kusitms.candoit.MoramMoramServer.domain.board.Service;

import kusitms.candoit.MoramMoramServer.domain.board.Dto.QuestionBoardDTO;
import kusitms.candoit.MoramMoramServer.domain.board.Dto.QuestionReplyDTO;

import java.util.List;

public interface QuestionReplyService {

    Long register(QuestionReplyDTO questionReplyDTO);

    void remove(Long replyId);
}
