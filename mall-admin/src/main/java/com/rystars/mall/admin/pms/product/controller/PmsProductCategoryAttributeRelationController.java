package com.rystars.mall.admin.pms.product.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.pms.product.bean.PmsProductCategoryAttributeRelation;
import com.rystars.mall.admin.pms.product.service.PmsProductCategoryAttributeRelationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【pms_product_category_attribute_relation(产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:11:31
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/product/category/attribute/relation")
@Tag(name = "PmsProductCategoryAttributeRelationController", description = "产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）")
public class PmsProductCategoryAttributeRelationController implements IBaseController<PmsProductCategoryAttributeRelationService, PmsProductCategoryAttributeRelation> {

    private final PmsProductCategoryAttributeRelationService pmsProductCategoryAttributeRelationService;

    @Override
    public PmsProductCategoryAttributeRelationService getService() {
        return pmsProductCategoryAttributeRelationService;
    }

}
