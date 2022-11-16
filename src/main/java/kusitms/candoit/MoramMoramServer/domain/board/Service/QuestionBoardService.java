package kusitms.candoit.MoramMoramServer.domain.board.Service;

import kusitms.candoit.MoramMoramServer.domain.board.Dto.PageResponseDTO;
import kusitms.candoit.MoramMoramServer.domain.board.Dto.QuestionBoardDTO;

import java.util.List;

public interface QuestionBoardService {

    Long register(QuestionBoardDTO questionBoardDTO);

    QuestionBoardDTO readOne(Long questionBoardId);

    void modify(Long questionBoardId,QuestionBoardDTO questionBoardDTO);

    void remove(Long questionBoardId);

    List<QuestionBoardDTO> getBoard(int page);
}
