package com.rystars.mall.admin.cms.help.controller;

import com.rystars.mall.admin.cms.help.bean.CmsHelpCategory;
import com.rystars.mall.admin.cms.help.service.CmsHelpCategoryService;
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
 * 【cms_help_category(帮助分类表)】Controller
 * @author rystars
 * @date 2023-04-13 10:38:18
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cms/help/category")
@Tag(name = "CmsHelpCategoryController", description = "帮助分类表")
public class CmsHelpCategoryController {

    private final CmsHelpCategoryService cmsHelpCategoryService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<CmsHelpCategory> save(@Parameter(name = "帮助分类表", required = true)
                                                     @RequestBody CmsHelpCategory cmsHelpCategory) {
        return Result.instance(cmsHelpCategoryService.save(cmsHelpCategory));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<CmsHelpCategory> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody CmsHelpCategory cmsHelpCategory) {
        boolean result = cmsHelpCategoryService.update(cmsHelpCategory, new UpdateWrapper<CmsHelpCategory>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<CmsHelpCategory> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(cmsHelpCategoryService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<CmsHelpCategory> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(cmsHelpCategoryService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<CmsHelpCategory>> queryAll() {
        return Result.success(cmsHelpCategoryService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<CmsHelpCategory>> queryPage(@RequestBody PageParam page) {
        return Result.success(cmsHelpCategoryService.queryPage(page, null));
    }

}
