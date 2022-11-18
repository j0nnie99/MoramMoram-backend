package kusitms.candoit.MoramMoramServer.domain.fleaMarket.Repository;

import kusitms.candoit.MoramMoramServer.domain.fleaMarket.Entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository<Like,Long> {
}
