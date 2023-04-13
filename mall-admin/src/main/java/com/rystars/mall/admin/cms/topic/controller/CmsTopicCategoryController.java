package com.rystars.mall.admin.cms.topic.controller;

import com.rystars.mall.admin.cms.topic.bean.CmsTopicCategory;
import com.rystars.mall.admin.cms.topic.service.CmsTopicCategoryService;
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
 * 【cms_topic_category(话题分类表)】Controller
 * @author rystars
 * @date 2023-04-13 10:39:19
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cms/topic/category")
@Tag(name = "CmsTopicCategoryController", description = "话题分类表")
public class CmsTopicCategoryController {

    private final CmsTopicCategoryService cmsTopicCategoryService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<CmsTopicCategory> save(@Parameter(name = "话题分类表", required = true)
                                                     @RequestBody CmsTopicCategory cmsTopicCategory) {
        return Result.instance(cmsTopicCategoryService.save(cmsTopicCategory));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<CmsTopicCategory> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody CmsTopicCategory cmsTopicCategory) {
        boolean result = cmsTopicCategoryService.update(cmsTopicCategory, new UpdateWrapper<CmsTopicCategory>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<CmsTopicCategory> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(cmsTopicCategoryService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<CmsTopicCategory> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(cmsTopicCategoryService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<CmsTopicCategory>> queryAll() {
        return Result.success(cmsTopicCategoryService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<CmsTopicCategory>> queryPage(@RequestBody PageParam page) {
        return Result.success(cmsTopicCategoryService.queryPage(page, null));
    }

}
