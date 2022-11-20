package kusitms.candoit.MoramMoramServer.domain.board.Repository;

import kusitms.candoit.MoramMoramServer.domain.board.Entity.QuestionBoard;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionBoardRepository extends JpaRepository<QuestionBoard, Long> {

    Page<QuestionBoard> findAll(Pageable pageable);

    @Query(value="select question_board_id, created_at, updated_at, board_date, img, like_cnt, name, note, reply_cnt, status, title, user_id, view_cnt from question_board\n" +
            "         where created_at > DATE_ADD(now(), INTERVAL -7 DAY)\n" +
            "         order by like_cnt desc,view_cnt desc  limit 5;\n", nativeQuery = true)
    List<QuestionBoard> findTop();

}
