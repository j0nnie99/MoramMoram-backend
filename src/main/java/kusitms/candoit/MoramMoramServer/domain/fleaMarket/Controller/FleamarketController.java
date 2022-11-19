package kusitms.candoit.MoramMoramServer.domain.fleaMarket.Controller;

import kusitms.candoit.MoramMoramServer.domain.fleaMarket.Dto.FleamarketDto;
import kusitms.candoit.MoramMoramServer.domain.fleaMarket.Entity.Fleamarket;
import kusitms.candoit.MoramMoramServer.domain.fleaMarket.Service.FleamarketService;
import kusitms.candoit.MoramMoramServer.global.Model.Status;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class FleamarketController {

    private final FleamarketService fleamarketService;

    @GetMapping("markets")
    public ResponseEntity<List<Object>> mainpage() {
        return fleamarketService.mainpage();
    }

/*    @GetMapping("markets/{marketId}")
    public ResponseEntity<FleamarketDto.detail> detailpage(
            @PathVariable Long marketId
    ){
        return fleamarketService.detailpage(marketId);
    }*/

    @GetMapping("markets/")
    public ResponseEntity<FleamarketDto.detail> detailpage(
            @RequestParam Long m_id
    ) {
        return fleamarketService.detailpage(m_id);
    }

    @GetMapping("markets/search")
    public ResponseEntity<List<Fleamarket>> searchpage(
        @RequestParam String m_name
    ){
        return fleamarketService.searchpage(m_name);
    }


    // 찜기능
    @PostMapping("wish")
    @PreAuthorize("hasAnyRole('ADMIN','USER','OFFICE')")
    public ResponseEntity<Status> itemLike(
            @RequestBody FleamarketDto.like request
    ){
        return fleamarketService.itemLike(request);
    }
}
