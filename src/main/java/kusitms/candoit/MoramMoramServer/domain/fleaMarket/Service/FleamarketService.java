package kusitms.candoit.MoramMoramServer.domain.fleaMarket.Service;

import kusitms.candoit.MoramMoramServer.domain.fleaMarket.Dto.FleamarketDto;
import kusitms.candoit.MoramMoramServer.domain.fleaMarket.Entity.Fleamarket;
import kusitms.candoit.MoramMoramServer.domain.fleaMarket.Entity.Like;
import kusitms.candoit.MoramMoramServer.domain.fleaMarket.Repository.FleamarketRepository;
import kusitms.candoit.MoramMoramServer.domain.fleaMarket.Repository.LikeRepository;
import kusitms.candoit.MoramMoramServer.domain.user.Entity.User;
import kusitms.candoit.MoramMoramServer.domain.user.Repository.UserRepository;
import kusitms.candoit.MoramMoramServer.global.Model.Status;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static kusitms.candoit.MoramMoramServer.global.Model.Status.FLEAMARKET_LIKE_TRUE;

@Service
@RequiredArgsConstructor
@Slf4j
public class FleamarketService {

    private final FleamarketRepository fleamarketRepository;
    private final LikeRepository likeRepository;
    private final UserRepository userRepository;

    @Transactional
    public ResponseEntity<List<Object>> mainpage() {
        List<Fleamarket> fleamarkets = fleamarketRepository.findAll();
        List<Fleamarket> fleamarketsTime = fleamarketRepository.findAll(Sort.by(Sort.Direction.ASC, "end")).subList(0, 5);

        List<Object> fleamarketList = new ArrayList<>();
        fleamarketList.add(fleamarketsTime);
        fleamarketList.add(fleamarkets);

        return new ResponseEntity<>(fleamarketList, HttpStatus.OK);
    }

    public ResponseEntity<FleamarketDto.detail> detailpage(Long m_id) {
        log.info(m_id.toString());
        Fleamarket fleamarket = fleamarketRepository.findById(m_id).orElseThrow(
                NullPointerException::new
        );

        return new ResponseEntity<>(FleamarketDto.detail.response(fleamarket),HttpStatus.OK);
    }

    public ResponseEntity<Status> itemLike(FleamarketDto.like request) {
        User user = userRepository.findByEmail(SecurityContextHolder.getContext().getAuthentication().getName()).orElseThrow(
                NullPointerException::new
        );

        likeRepository.save(
                Like.builder()
                        .marketId(request.getMarketId())
                        .userId(user.getId())
                        .name(user.getName())
                        .build()
        );
        return new ResponseEntity<>(FLEAMARKET_LIKE_TRUE,HttpStatus.OK);
    }
}
