package kusitms.candoit.MoramMoramServer.repository;


import kusitms.candoit.MoramMoramServer.MoramMoramServerApplication;
import kusitms.candoit.MoramMoramServer.domain.board.Dto.QuestionBoardDTO;
import kusitms.candoit.MoramMoramServer.domain.board.Entity.QuestionBoard;
import kusitms.candoit.MoramMoramServer.domain.board.Repository.QuestionBoardRepository;
import kusitms.candoit.MoramMoramServer.domain.board.Service.QuestionBoardService;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest(classes = MoramMoramServerApplication.class)
public class QuestionBoardRepositoryTests {

    @Autowired
    private QuestionBoardRepository questionBoardRepository;


    @Test
    public void testInsert(){
        IntStream.rangeClosed(1,3).forEach(i->{
            QuestionBoard board = QuestionBoard.builder()
                    .user_id((long) i)
                    .title("title...")
                    .note("content..."+i)
                    .build();

           QuestionBoard result = questionBoardRepository.save(board);
        });
    }


}
