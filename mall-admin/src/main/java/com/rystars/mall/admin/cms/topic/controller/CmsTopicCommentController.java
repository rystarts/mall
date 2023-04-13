package com.rystars.mall.admin.cms.topic.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.cms.topic.bean.CmsTopicComment;
import com.rystars.mall.admin.cms.topic.service.CmsTopicCommentService;
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
 * 【cms_topic_comment(专题评论表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:39:19
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cms/topic/comment")
@Tag(name = "CmsTopicCommentController", description = "专题评论表")
public class CmsTopicCommentController {

    private final CmsTopicCommentService cmsTopicCommentService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<CmsTopicComment> save(@Parameter(name = "专题评论表", required = true)
                                        @RequestBody CmsTopicComment cmsTopicComment) {
        return Result.instance(cmsTopicCommentService.save(cmsTopicComment));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<CmsTopicComment> update(@Parameter(name = "主键", required = true)
                                          @PathVariable(value = "id") String id,
                                          @RequestBody CmsTopicComment cmsTopicComment) {
        boolean result = cmsTopicCommentService.update(cmsTopicComment, new UpdateWrapper<CmsTopicComment>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<CmsTopicComment> delete(@Parameter(name = "主键", required = true)
                                          @PathVariable(value = "id") String id) {
        return Result.instance(cmsTopicCommentService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<CmsTopicComment> queryById(@Parameter(name = "主键", required = true)
                                             @PathVariable(value = "id") String id) {
        return Result.success(cmsTopicCommentService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<CmsTopicComment>> queryAll() {
        return Result.success(cmsTopicCommentService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<CmsTopicComment>> queryPage(@RequestBody PageParam page) {
        return Result.success(cmsTopicCommentService.queryPage(page, null));
    }

}
