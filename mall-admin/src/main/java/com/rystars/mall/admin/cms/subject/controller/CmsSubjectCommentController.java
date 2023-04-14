package com.rystars.mall.admin.cms.subject.controller;

import com.rystars.mall.admin.cms.subject.bean.CmsSubjectComment;
import com.rystars.mall.admin.cms.subject.service.CmsSubjectCommentService;
import com.rystars.mall.admin.frame.base.controller.IBaseController;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【cms_subject_comment(专题评论表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:10:02
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cms/subject/comment")
@Tag(name = "CmsSubjectCommentController", description = "专题评论表")
public class CmsSubjectCommentController implements IBaseController<CmsSubjectCommentService, CmsSubjectComment> {

    private final CmsSubjectCommentService cmsSubjectCommentService;

    @Override
    public CmsSubjectCommentService getService() {
        return cmsSubjectCommentService;
    }

}
