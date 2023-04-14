package com.rystars.mall.admin.pms.product.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.pms.product.bean.PmsProductCategory;
import com.rystars.mall.admin.pms.product.service.PmsProductCategoryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【pms_product_category(产品分类)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:11:31
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/product/category")
@Tag(name = "PmsProductCategoryController", description = "产品分类")
public class PmsProductCategoryController implements IBaseController<PmsProductCategoryService, PmsProductCategory> {

    private final PmsProductCategoryService pmsProductCategoryService;

    @Override
    public PmsProductCategoryService getService() {
        return pmsProductCategoryService;
    }

}
