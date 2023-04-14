package com.rystars.mall.admin.cms.topic.controller;

import com.rystars.mall.admin.cms.topic.bean.CmsTopicCategory;
import com.rystars.mall.admin.cms.topic.service.CmsTopicCategoryService;
import com.rystars.mall.admin.frame.base.controller.IBaseController;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【cms_topic_category(话题分类表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:10:10
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cms/topic/category")
@Tag(name = "CmsTopicCategoryController", description = "话题分类表")
public class CmsTopicCategoryController implements IBaseController<CmsTopicCategoryService, CmsTopicCategory> {

    private final CmsTopicCategoryService cmsTopicCategoryService;

    @Override
    public CmsTopicCategoryService getService() {
        return cmsTopicCategoryService;
    }

}
