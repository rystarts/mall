package com.rystars.mall.admin.ums.resource.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.ums.resource.bean.UmsResourceCategory;
import com.rystars.mall.admin.ums.resource.service.UmsResourceCategoryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【ums_resource_category(资源分类表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:13:22
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/resource/category")
@Tag(name = "UmsResourceCategoryController", description = "资源分类表")
public class UmsResourceCategoryController implements IBaseController<UmsResourceCategoryService, UmsResourceCategory> {

    private final UmsResourceCategoryService umsResourceCategoryService;

    @Override
    public UmsResourceCategoryService getService() {
        return umsResourceCategoryService;
    }

}
