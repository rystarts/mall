package com.rystars.mall.admin.pms.product.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.pms.product.bean.PmsProductCategoryAttributeRelation;
import com.rystars.mall.admin.pms.product.service.PmsProductCategoryAttributeRelationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【pms_product_category_attribute_relation(产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:50:57
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/product/category/attribute/relation")
@Tag(name = "PmsProductCategoryAttributeRelationController", description = "产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）")
public class PmsProductCategoryAttributeRelationController {

    private final PmsProductCategoryAttributeRelationService pmsProductCategoryAttributeRelationService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<PmsProductCategoryAttributeRelation> save(@Parameter(name = "产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）", required = true)
                                                            @RequestBody PmsProductCategoryAttributeRelation pmsProductCategoryAttributeRelation) {
        return Result.instance(pmsProductCategoryAttributeRelationService.save(pmsProductCategoryAttributeRelation));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<PmsProductCategoryAttributeRelation> update(@Parameter(name = "主键", required = true)
                                                              @PathVariable(value = "id") String id,
                                                              @RequestBody PmsProductCategoryAttributeRelation pmsProductCategoryAttributeRelation) {
        boolean result = pmsProductCategoryAttributeRelationService.update(pmsProductCategoryAttributeRelation, new UpdateWrapper<PmsProductCategoryAttributeRelation>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<PmsProductCategoryAttributeRelation> delete(@Parameter(name = "主键", required = true)
                                                              @PathVariable(value = "id") String id) {
        return Result.instance(pmsProductCategoryAttributeRelationService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<PmsProductCategoryAttributeRelation> queryById(@Parameter(name = "主键", required = true)
                                                                 @PathVariable(value = "id") String id) {
        return Result.success(pmsProductCategoryAttributeRelationService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<PmsProductCategoryAttributeRelation>> queryAll() {
        return Result.success(pmsProductCategoryAttributeRelationService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<PmsProductCategoryAttributeRelation>> queryPage(@RequestBody PageParam page) {
        return Result.success(pmsProductCategoryAttributeRelationService.queryPage(page, null));
    }

}
