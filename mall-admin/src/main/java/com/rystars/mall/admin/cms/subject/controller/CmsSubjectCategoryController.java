package com.rystars.mall.admin.cms.subject.controller;

import com.rystars.mall.admin.cms.subject.bean.CmsSubjectCategory;
import com.rystars.mall.admin.cms.subject.service.CmsSubjectCategoryService;
import com.rystars.mall.admin.frame.base.controller.IBaseController;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【cms_subject_category(专题分类表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:10:02
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cms/subject/category")
@Tag(name = "CmsSubjectCategoryController", description = "专题分类表")
public class CmsSubjectCategoryController implements IBaseController<CmsSubjectCategoryService, CmsSubjectCategory> {

    private final CmsSubjectCategoryService cmsSubjectCategoryService;

    @Override
    public CmsSubjectCategoryService getService() {
        return cmsSubjectCategoryService;
    }

}
