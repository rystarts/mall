package com.rystars.mall.admin.cms.subject.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.cms.subject.bean.CmsSubject;
import com.rystars.mall.admin.cms.subject.service.CmsSubjectService;
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
 * 【cms_subject(专题表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:39:09
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cms/subject")
@Tag(name = "CmsSubjectController", description = "专题表")
public class CmsSubjectController {

    private final CmsSubjectService cmsSubjectService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<CmsSubject> save(@Parameter(name = "专题表", required = true)
                                   @RequestBody CmsSubject cmsSubject) {
        return Result.instance(cmsSubjectService.save(cmsSubject));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<CmsSubject> update(@Parameter(name = "主键", required = true)
                                     @PathVariable(value = "id") String id,
                                     @RequestBody CmsSubject cmsSubject) {
        boolean result = cmsSubjectService.update(cmsSubject, new UpdateWrapper<CmsSubject>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<CmsSubject> delete(@Parameter(name = "主键", required = true)
                                     @PathVariable(value = "id") String id) {
        return Result.instance(cmsSubjectService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<CmsSubject> queryById(@Parameter(name = "主键", required = true)
                                        @PathVariable(value = "id") String id) {
        return Result.success(cmsSubjectService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<CmsSubject>> queryAll() {
        return Result.success(cmsSubjectService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<CmsSubject>> queryPage(@RequestBody PageParam page) {
        return Result.success(cmsSubjectService.queryPage(page, null));
    }

}
