package kusitms.candoit.MoramMoramServer.repository;

import kusitms.candoit.MoramMoramServer.domain.board.Entity.QuestionBoard;
import kusitms.candoit.MoramMoramServer.domain.board.Entity.QuestionReply;
import kusitms.candoit.MoramMoramServer.domain.board.Repository.QuestionReplyRepository;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@SpringBootTest
@Log4j2
public class ReplyRepositoryTests {
    @Autowired
    private QuestionReplyRepository questionReplyRepository;

    @Test
    public void testInsert() {
        Long id = 1L;

        QuestionBoard board = QuestionBoard.builder()
                .questionBoardId(id)
                .build();

        QuestionReply reply = QuestionReply.builder()
                .questionBoard(board)
                .replyText("댓글...")
                .replyer("replyer1")
                .status("ACTIVE")
                .build();

        questionReplyRepository.save(reply);
    }

    @Test
    public void testBoardReplies(){
        Long id = 1L;

        Pageable pageable = PageRequest.of(0,10, Sort.by("updatedAt").descending());

        Page<QuestionReply> result = questionReplyRepository.listOfBoard(id, pageable);

        result.getContent().forEach(questionReply -> {
            System.out.println("어쩌구");
        });
    }
}
