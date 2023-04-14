package com.rystars.mall.admin.cms.topic.controller;

import com.rystars.mall.admin.cms.topic.bean.CmsTopic;
import com.rystars.mall.admin.cms.topic.service.CmsTopicService;
import com.rystars.mall.admin.frame.base.controller.IBaseController;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【cms_topic(话题表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:10:10
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cms/topic")
@Tag(name = "CmsTopicController", description = "话题表")
public class CmsTopicController implements IBaseController<CmsTopicService, CmsTopic> {

    private final CmsTopicService cmsTopicService;

    @Override
    public CmsTopicService getService() {
        return cmsTopicService;
    }

}
