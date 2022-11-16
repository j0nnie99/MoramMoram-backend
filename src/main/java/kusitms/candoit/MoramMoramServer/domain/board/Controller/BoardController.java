package kusitms.candoit.MoramMoramServer.domain.board.Controller;

import kusitms.candoit.MoramMoramServer.domain.board.Dto.QuestionBoardDTO;
import kusitms.candoit.MoramMoramServer.domain.board.Service.QuestionBoardService;
import kusitms.candoit.MoramMoramServer.domain.user.Dto.TokenInfoResponseDto;
import kusitms.candoit.MoramMoramServer.domain.user.Repository.UserRepository;
import kusitms.candoit.MoramMoramServer.domain.user.Service.UserService;
import kusitms.candoit.MoramMoramServer.global.config.Jwt.SecurityUtil;
import kusitms.candoit.MoramMoramServer.global.config.Response.BaseResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.Objects;

@RestController
@Slf4j
@RequiredArgsConstructor
public class BoardController {

    //TODO 예외처리
    private final QuestionBoardService questionBoardService;

    private final UserRepository userRepository;

    private TokenInfoResponseDto getTokenInfo() {
        return TokenInfoResponseDto.Response(
                Objects.requireNonNull(SecurityUtil.getCurrentUsername()
                        .flatMap(
                                userRepository::findOneWithAuthoritiesByEmail)
                        .orElse(null))
        );
    }

    @GetMapping(
            value = "/questionBoard/list" )
    public Object getList(@RequestParam(value="page", defaultValue="0") int page) throws Exception {
        return questionBoardService.getBoard(page);
    }

    @PostMapping(value = "/questionBoard/register",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public BaseResponse<Long> registerPost(@RequestBody@Valid QuestionBoardDTO boardDTO) {

        Long id = getTokenInfo().getId();
        String name = getTokenInfo().getName();

        boardDTO.setUserId(id);
        boardDTO.setName(name);
        Long questionBoardId = questionBoardService.register(boardDTO);

        return new BaseResponse<>(questionBoardId);
    }

    @GetMapping(
            value = "/questionBoard/{questionBoardId}"
    )
    public BaseResponse<QuestionBoardDTO> getOne(@PathVariable("questionBoardId") Long questionBoardId) throws Exception{
        QuestionBoardDTO questionBoardDTO = questionBoardService.readOne(questionBoardId);
        return new BaseResponse<>(questionBoardDTO);
    }

    @PatchMapping(value = "/questionBoard/post/edit")
    public BaseResponse<String> modifyOne(@RequestParam(value="post_id")Long questionBoardId, @RequestBody QuestionBoardDTO questionBoardDTO){
        questionBoardService.modify(questionBoardId,questionBoardDTO);

        return new BaseResponse<>("내용 수정했습니다.");
    }
}

