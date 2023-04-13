package com.rystars.mall.admin.ums.resource.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.ums.resource.bean.UmsResourceCategory;
import com.rystars.mall.admin.ums.resource.service.UmsResourceCategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【ums_resource_category(资源分类表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:59:24
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/resource/category")
@Tag(name = "UmsResourceCategoryController", description = "资源分类表")
public class UmsResourceCategoryController {

    private final UmsResourceCategoryService umsResourceCategoryService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<UmsResourceCategory> save(@Parameter(name = "资源分类表", required = true)
                                            @RequestBody UmsResourceCategory umsResourceCategory) {
        return Result.instance(umsResourceCategoryService.save(umsResourceCategory));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<UmsResourceCategory> update(@Parameter(name = "主键", required = true)
                                              @PathVariable(value = "id") String id,
                                              @RequestBody UmsResourceCategory umsResourceCategory) {
        boolean result = umsResourceCategoryService.update(umsResourceCategory, new UpdateWrapper<UmsResourceCategory>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<UmsResourceCategory> delete(@Parameter(name = "主键", required = true)
                                              @PathVariable(value = "id") String id) {
        return Result.instance(umsResourceCategoryService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<UmsResourceCategory> queryById(@Parameter(name = "主键", required = true)
                                                 @PathVariable(value = "id") String id) {
        return Result.success(umsResourceCategoryService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<UmsResourceCategory>> queryAll() {
        return Result.success(umsResourceCategoryService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<UmsResourceCategory>> queryPage(@RequestBody PageParam page) {
        return Result.success(umsResourceCategoryService.queryPage(page, null));
    }

}
