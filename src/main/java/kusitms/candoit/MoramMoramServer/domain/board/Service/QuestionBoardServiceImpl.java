package kusitms.candoit.MoramMoramServer.domain.board.Service;

import kusitms.candoit.MoramMoramServer.domain.board.Dto.QuestionBoardDTO;
import kusitms.candoit.MoramMoramServer.domain.board.Entity.QuestionBoard;
import kusitms.candoit.MoramMoramServer.domain.board.Repository.QuestionBoardRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class QuestionBoardServiceImpl implements QuestionBoardService {

    private final ModelMapper modelMapper;
    private final QuestionBoardRepository questionBoardRepository;

    @Override
    public Long register(QuestionBoardDTO questionBoardDTO) {
        QuestionBoard board = modelMapper.map(questionBoardDTO, QuestionBoard.class);

        Long question_board_id = questionBoardRepository.save(board).getQuestion_board_id();

        return question_board_id;
    }

    @Override
    public QuestionBoardDTO readOne(Long question_board_id) {

        Optional<QuestionBoard> result = questionBoardRepository.findById(question_board_id);

        QuestionBoard board = result.orElseThrow();

        QuestionBoardDTO boardDTO = modelMapper.map(board, QuestionBoardDTO.class);

        return boardDTO;
    }

    @Override
    public void modify(QuestionBoardDTO questionBoardDTO) {
        Optional<QuestionBoard> result = questionBoardRepository.findById(questionBoardDTO.getQuestion_board_id());

        //TODO 수정보완

        result.ifPresent( board ->{
            if(questionBoardDTO.getTitle() != null){
                board.changTitle(questionBoardDTO.getTitle());
            }
            if(questionBoardDTO.getNote()!=null){
                board.changeNote(questionBoardDTO.getNote());
            }
            if(questionBoardDTO.getImg() !=null ){
                board.changeImg(questionBoardDTO.getImg());
            }
            questionBoardRepository.save(board);
        });
    }
}
