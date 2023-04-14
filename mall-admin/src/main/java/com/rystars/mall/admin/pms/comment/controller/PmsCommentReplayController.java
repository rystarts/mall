package com.rystars.mall.admin.pms.comment.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.pms.comment.bean.PmsCommentReplay;
import com.rystars.mall.admin.pms.comment.service.PmsCommentReplayService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【pms_comment_replay(产品评价回复表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:11:05
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/comment/replay")
@Tag(name = "PmsCommentReplayController", description = "产品评价回复表")
public class PmsCommentReplayController implements IBaseController<PmsCommentReplayService, PmsCommentReplay> {

    private final PmsCommentReplayService pmsCommentReplayService;

    @Override
    public PmsCommentReplayService getService() {
        return pmsCommentReplayService;
    }

}
