package com.rystars.mall.admin.cms.help.controller;

import com.rystars.mall.admin.cms.help.bean.CmsHelpCategory;
import com.rystars.mall.admin.cms.help.service.CmsHelpCategoryService;
import com.rystars.mall.admin.frame.base.controller.IBaseController;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【cms_help_category(帮助分类表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:09:30
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cms/help/category")
@Tag(name = "CmsHelpCategoryController", description = "帮助分类表")
public class CmsHelpCategoryController implements IBaseController<CmsHelpCategoryService, CmsHelpCategory> {

    private final CmsHelpCategoryService cmsHelpCategoryService;

    @Override
    public CmsHelpCategoryService getService() {
        return cmsHelpCategoryService;
    }

}
