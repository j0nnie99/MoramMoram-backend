package kusitms.candoit.MoramMoramServer.repository;

import kusitms.candoit.MoramMoramServer.domain.board.Dto.QuestionBoardDTO;
import kusitms.candoit.MoramMoramServer.domain.board.Service.QuestionBoardService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QuestionBoardServiceTests {

    @Autowired
    private QuestionBoardService questionBoardService;

    @Test
    public void testRegister(){

        QuestionBoardDTO questionBoardDTO = QuestionBoardDTO.builder()
                .userId(1L)
                .title("제목")
                .note("내용 입력")
                .build();

        Long bno = questionBoardService.register(questionBoardDTO);
    }

   // @Test
//    public void testModify(){
//
//        //변경에 필요한 데이터만
//        QuestionBoardDTO questionBoardDTO = QuestionBoardDTO.builder()
//                .questionBoardId(1L)
//                .title("Updated...........")
//                .build();
//
//        questionBoardService.modify(questionBoardDTO);
//    }
}
