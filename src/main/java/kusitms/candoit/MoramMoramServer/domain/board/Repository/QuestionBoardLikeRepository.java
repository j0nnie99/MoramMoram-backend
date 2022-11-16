package kusitms.candoit.MoramMoramServer.domain.board.Repository;

import kusitms.candoit.MoramMoramServer.domain.board.Entity.QuestionBoard;
import kusitms.candoit.MoramMoramServer.domain.board.Entity.QuestionBoardLike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionBoardLikeRepository  extends JpaRepository <QuestionBoardLike, Long> {

}
