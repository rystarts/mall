package com.rystars.mall.admin.pms.product.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.pms.product.bean.PmsProductAttributeCategory;
import com.rystars.mall.admin.pms.product.service.PmsProductAttributeCategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【pms_product_attribute_category(产品属性分类表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:50:56
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/product/attribute/category")
@Tag(name = "PmsProductAttributeCategoryController", description = "产品属性分类表")
public class PmsProductAttributeCategoryController {

    private final PmsProductAttributeCategoryService pmsProductAttributeCategoryService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<PmsProductAttributeCategory> save(@Parameter(name = "产品属性分类表", required = true)
                                                    @RequestBody PmsProductAttributeCategory pmsProductAttributeCategory) {
        return Result.instance(pmsProductAttributeCategoryService.save(pmsProductAttributeCategory));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<PmsProductAttributeCategory> update(@Parameter(name = "主键", required = true)
                                                      @PathVariable(value = "id") String id,
                                                      @RequestBody PmsProductAttributeCategory pmsProductAttributeCategory) {
        boolean result = pmsProductAttributeCategoryService.update(pmsProductAttributeCategory, new UpdateWrapper<PmsProductAttributeCategory>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<PmsProductAttributeCategory> delete(@Parameter(name = "主键", required = true)
                                                      @PathVariable(value = "id") String id) {
        return Result.instance(pmsProductAttributeCategoryService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<PmsProductAttributeCategory> queryById(@Parameter(name = "主键", required = true)
                                                         @PathVariable(value = "id") String id) {
        return Result.success(pmsProductAttributeCategoryService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<PmsProductAttributeCategory>> queryAll() {
        return Result.success(pmsProductAttributeCategoryService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<PmsProductAttributeCategory>> queryPage(@RequestBody PageParam page) {
        return Result.success(pmsProductAttributeCategoryService.queryPage(page, null));
    }

}
