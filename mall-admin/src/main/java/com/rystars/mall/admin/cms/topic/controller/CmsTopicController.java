package com.rystars.mall.admin.cms.topic.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.cms.topic.bean.CmsTopic;
import com.rystars.mall.admin.cms.topic.service.CmsTopicService;
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
 * 【cms_topic(话题表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:39:19
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cms/topic")
@Tag(name = "CmsTopicController", description = "话题表")
public class CmsTopicController {

    private final CmsTopicService cmsTopicService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<CmsTopic> save(@Parameter(name = "话题表", required = true)
                                 @RequestBody CmsTopic cmsTopic) {
        return Result.instance(cmsTopicService.save(cmsTopic));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<CmsTopic> update(@Parameter(name = "主键", required = true)
                                   @PathVariable(value = "id") String id,
                                   @RequestBody CmsTopic cmsTopic) {
        boolean result = cmsTopicService.update(cmsTopic, new UpdateWrapper<CmsTopic>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<CmsTopic> delete(@Parameter(name = "主键", required = true)
                                   @PathVariable(value = "id") String id) {
        return Result.instance(cmsTopicService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<CmsTopic> queryById(@Parameter(name = "主键", required = true)
                                      @PathVariable(value = "id") String id) {
        return Result.success(cmsTopicService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<CmsTopic>> queryAll() {
        return Result.success(cmsTopicService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<CmsTopic>> queryPage(@RequestBody PageParam page) {
        return Result.success(cmsTopicService.queryPage(page, null));
    }

}
