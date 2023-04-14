package com.rystars.mall.admin.cms.topic.controller;

import com.rystars.mall.admin.cms.topic.bean.CmsTopicComment;
import com.rystars.mall.admin.cms.topic.service.CmsTopicCommentService;
import com.rystars.mall.admin.frame.base.controller.IBaseController;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【cms_topic_comment(专题评论表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:10:10
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cms/topic/comment")
@Tag(name = "CmsTopicCommentController", description = "专题评论表")
public class CmsTopicCommentController implements IBaseController<CmsTopicCommentService, CmsTopicComment> {

    private final CmsTopicCommentService cmsTopicCommentService;

    @Override
    public CmsTopicCommentService getService() {
        return cmsTopicCommentService;
    }

}
