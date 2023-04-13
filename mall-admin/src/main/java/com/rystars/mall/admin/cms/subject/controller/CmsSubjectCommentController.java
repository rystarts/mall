package com.rystars.mall.admin.cms.subject.controller;

import com.rystars.mall.admin.cms.subject.bean.CmsSubjectComment;
import com.rystars.mall.admin.cms.subject.service.CmsSubjectCommentService;
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
 * 【cms_subject_comment(专题评论表)】Controller
 * @author rystars
 * @date 2023-04-13 10:39:09
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cms/subject/comment")
@Tag(name = "CmsSubjectCommentController", description = "专题评论表")
public class CmsSubjectCommentController {

    private final CmsSubjectCommentService cmsSubjectCommentService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<CmsSubjectComment> save(@Parameter(name = "专题评论表", required = true)
                                                     @RequestBody CmsSubjectComment cmsSubjectComment) {
        return Result.instance(cmsSubjectCommentService.save(cmsSubjectComment));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<CmsSubjectComment> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody CmsSubjectComment cmsSubjectComment) {
        boolean result = cmsSubjectCommentService.update(cmsSubjectComment, new UpdateWrapper<CmsSubjectComment>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<CmsSubjectComment> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(cmsSubjectCommentService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<CmsSubjectComment> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(cmsSubjectCommentService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<CmsSubjectComment>> queryAll() {
        return Result.success(cmsSubjectCommentService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<CmsSubjectComment>> queryPage(@RequestBody PageParam page) {
        return Result.success(cmsSubjectCommentService.queryPage(page, null));
    }

}
