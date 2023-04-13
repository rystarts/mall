package com.rystars.mall.admin.cms.subject.controller;

import com.rystars.mall.admin.cms.subject.bean.CmsSubjectProductRelation;
import com.rystars.mall.admin.cms.subject.service.CmsSubjectProductRelationService;
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
 * 【cms_subject_product_relation(专题商品关系表)】Controller
 * @author rystars
 * @date 2023-04-13 10:39:09
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cms/subject/product/relation")
@Tag(name = "CmsSubjectProductRelationController", description = "专题商品关系表")
public class CmsSubjectProductRelationController {

    private final CmsSubjectProductRelationService cmsSubjectProductRelationService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<CmsSubjectProductRelation> save(@Parameter(name = "专题商品关系表", required = true)
                                                     @RequestBody CmsSubjectProductRelation cmsSubjectProductRelation) {
        return Result.instance(cmsSubjectProductRelationService.save(cmsSubjectProductRelation));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<CmsSubjectProductRelation> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody CmsSubjectProductRelation cmsSubjectProductRelation) {
        boolean result = cmsSubjectProductRelationService.update(cmsSubjectProductRelation, new UpdateWrapper<CmsSubjectProductRelation>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<CmsSubjectProductRelation> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(cmsSubjectProductRelationService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<CmsSubjectProductRelation> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(cmsSubjectProductRelationService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<CmsSubjectProductRelation>> queryAll() {
        return Result.success(cmsSubjectProductRelationService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<CmsSubjectProductRelation>> queryPage(@RequestBody PageParam page) {
        return Result.success(cmsSubjectProductRelationService.queryPage(page, null));
    }

}
