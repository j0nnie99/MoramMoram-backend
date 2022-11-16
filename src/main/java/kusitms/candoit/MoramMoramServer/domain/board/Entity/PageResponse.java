package kusitms.candoit.MoramMoramServer.domain.board.Entity;

import java.time.LocalDateTime;

public interface PageResponse {
    String getTitle();
    int getViewCnt();
    int getLikeCnt();
    LocalDateTime getCreatedAt();
    LocalDateTime getUpdatedAt();
}
