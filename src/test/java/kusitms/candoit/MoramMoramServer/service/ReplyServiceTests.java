package kusitms.candoit.MoramMoramServer.service;

import kusitms.candoit.MoramMoramServer.domain.board.Dto.QuestionReplyDTO;
import kusitms.candoit.MoramMoramServer.domain.board.Service.QuestionReplyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ReplyServiceTests {
    @Autowired
    private QuestionReplyService questionReplyService;

//    @Test
//    public void testRegister(){
//
//        QuestionReplyDTO questionReplyDTO = QuestionReplyDTO.builder()
//                .replyText("댓글작성")
//                .replyer("홍길동")
//                .questionBoardId(1L)
//                .userId(10L)
//                .status("ACTIVE")
//                .build();
//
//        questionReplyService.register(questionReplyDTO);
//    }
}
