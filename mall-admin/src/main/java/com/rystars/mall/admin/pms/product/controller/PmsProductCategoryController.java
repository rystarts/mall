package com.rystars.mall.admin.pms.product.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.pms.product.bean.PmsProductCategory;
import com.rystars.mall.admin.pms.product.service.PmsProductCategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【pms_product_category(产品分类)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:50:56
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/product/category")
@Tag(name = "PmsProductCategoryController", description = "产品分类")
public class PmsProductCategoryController {

    private final PmsProductCategoryService pmsProductCategoryService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<PmsProductCategory> save(@Parameter(name = "产品分类", required = true)
                                           @RequestBody PmsProductCategory pmsProductCategory) {
        return Result.instance(pmsProductCategoryService.save(pmsProductCategory));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<PmsProductCategory> update(@Parameter(name = "主键", required = true)
                                             @PathVariable(value = "id") String id,
                                             @RequestBody PmsProductCategory pmsProductCategory) {
        boolean result = pmsProductCategoryService.update(pmsProductCategory, new UpdateWrapper<PmsProductCategory>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<PmsProductCategory> delete(@Parameter(name = "主键", required = true)
                                             @PathVariable(value = "id") String id) {
        return Result.instance(pmsProductCategoryService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<PmsProductCategory> queryById(@Parameter(name = "主键", required = true)
                                                @PathVariable(value = "id") String id) {
        return Result.success(pmsProductCategoryService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<PmsProductCategory>> queryAll() {
        return Result.success(pmsProductCategoryService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<PmsProductCategory>> queryPage(@RequestBody PageParam page) {
        return Result.success(pmsProductCategoryService.queryPage(page, null));
    }

}
