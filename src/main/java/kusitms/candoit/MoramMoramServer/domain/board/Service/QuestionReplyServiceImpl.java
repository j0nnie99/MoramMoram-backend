package kusitms.candoit.MoramMoramServer.domain.board.Service;

import kusitms.candoit.MoramMoramServer.domain.board.Dto.QuestionReplyDTO;
import kusitms.candoit.MoramMoramServer.domain.board.Entity.QuestionReply;
import kusitms.candoit.MoramMoramServer.domain.board.Repository.QuestionReplyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class QuestionReplyServiceImpl implements QuestionReplyService{
    private final QuestionReplyRepository questionReplyRepository;
    private final ModelMapper modelMapper;

    @Override
    public Long register(QuestionReplyDTO questionReplyDTO){

        QuestionReply reply = modelMapper.map(questionReplyDTO, QuestionReply.class);
        log.info("여기는.....?");
        Long id = questionReplyRepository.save(reply).getQuestionReplyId();

        return id;
    }
}
