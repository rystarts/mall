package com.rystars.mall.admin.pms.product.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.pms.product.bean.PmsProductAttributeCategory;
import com.rystars.mall.admin.pms.product.service.PmsProductAttributeCategoryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【pms_product_attribute_category(产品属性分类表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:11:31
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/product/attribute/category")
@Tag(name = "PmsProductAttributeCategoryController", description = "产品属性分类表")
public class PmsProductAttributeCategoryController implements IBaseController<PmsProductAttributeCategoryService, PmsProductAttributeCategory> {

    private final PmsProductAttributeCategoryService pmsProductAttributeCategoryService;

    @Override
    public PmsProductAttributeCategoryService getService() {
        return pmsProductAttributeCategoryService;
    }

}
