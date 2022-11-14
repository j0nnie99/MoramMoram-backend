package kusitms.candoit.MoramMoramServer.domain.board.Service;

import kusitms.candoit.MoramMoramServer.domain.board.Dto.QuestionBoardDTO;
import kusitms.candoit.MoramMoramServer.domain.board.Entity.QuestionBoard;

public interface QuestionBoardService {

    Long register(QuestionBoardDTO questionBoardDTO);

    QuestionBoardDTO readOne(Long question_board_id);

    void modify(QuestionBoardDTO questionBoardDTO);
}
