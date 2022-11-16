package kusitms.candoit.MoramMoramServer.domain.board.Repository;

import kusitms.candoit.MoramMoramServer.domain.board.Entity.QuestionBoard;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionBoardRepository extends JpaRepository<QuestionBoard, Long> {

    // @Query(value = "select title,viewCnt,likeCnt,createdAt,updatedAt from QuestionBoard")
    Page<QuestionBoard> findAll(Pageable pageable);

}
