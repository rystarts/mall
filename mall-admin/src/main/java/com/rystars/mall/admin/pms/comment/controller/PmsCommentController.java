package com.rystars.mall.admin.pms.comment.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.pms.comment.bean.PmsComment;
import com.rystars.mall.admin.pms.comment.service.PmsCommentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【pms_comment(商品评价表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:11:05
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/comment")
@Tag(name = "PmsCommentController", description = "商品评价表")
public class PmsCommentController implements IBaseController<PmsCommentService, PmsComment> {

    private final PmsCommentService pmsCommentService;

    @Override
    public PmsCommentService getService() {
        return pmsCommentService;
    }

}
