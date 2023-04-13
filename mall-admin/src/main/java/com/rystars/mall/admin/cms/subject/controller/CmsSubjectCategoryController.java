package com.rystars.mall.admin.cms.subject.controller;

import com.rystars.mall.admin.cms.subject.bean.CmsSubjectCategory;
import com.rystars.mall.admin.cms.subject.service.CmsSubjectCategoryService;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 【cms_subject_category(专题分类表)】Controller
 * @author rystars
 * @date 2023-04-13 10:39:09
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cms/subject/category")
@Tag(name = "CmsSubjectCategoryController", description = "专题分类表")
public class CmsSubjectCategoryController {

    private final CmsSubjectCategoryService cmsSubjectCategoryService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<CmsSubjectCategory> save(@Parameter(name = "专题分类表", required = true)
                                                     @RequestBody CmsSubjectCategory cmsSubjectCategory) {
        return Result.instance(cmsSubjectCategoryService.save(cmsSubjectCategory));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<CmsSubjectCategory> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody CmsSubjectCategory cmsSubjectCategory) {
        boolean result = cmsSubjectCategoryService.update(cmsSubjectCategory, new UpdateWrapper<CmsSubjectCategory>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<CmsSubjectCategory> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(cmsSubjectCategoryService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<CmsSubjectCategory> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(cmsSubjectCategoryService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<CmsSubjectCategory>> queryAll() {
        return Result.success(cmsSubjectCategoryService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<CmsSubjectCategory>> queryPage(@RequestBody PageParam page) {
        return Result.success(cmsSubjectCategoryService.queryPage(page, null));
    }

}
