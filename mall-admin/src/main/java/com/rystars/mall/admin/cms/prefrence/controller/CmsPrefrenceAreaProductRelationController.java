package com.rystars.mall.admin.cms.prefrence.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.cms.prefrence.bean.CmsPrefrenceAreaProductRelation;
import com.rystars.mall.admin.cms.prefrence.service.CmsPrefrenceAreaProductRelationService;
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
 * 【cms_prefrence_area_product_relation(优选专区和产品关系表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:38:54
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cms/prefrence/area/product/relation")
@Tag(name = "CmsPrefrenceAreaProductRelationController", description = "优选专区和产品关系表")
public class CmsPrefrenceAreaProductRelationController {

    private final CmsPrefrenceAreaProductRelationService cmsPrefrenceAreaProductRelationService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<CmsPrefrenceAreaProductRelation> save(@Parameter(name = "优选专区和产品关系表", required = true)
                                                        @RequestBody CmsPrefrenceAreaProductRelation cmsPrefrenceAreaProductRelation) {
        return Result.instance(cmsPrefrenceAreaProductRelationService.save(cmsPrefrenceAreaProductRelation));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<CmsPrefrenceAreaProductRelation> update(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id,
                                                          @RequestBody CmsPrefrenceAreaProductRelation cmsPrefrenceAreaProductRelation) {
        boolean result = cmsPrefrenceAreaProductRelationService.update(cmsPrefrenceAreaProductRelation, new UpdateWrapper<CmsPrefrenceAreaProductRelation>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<CmsPrefrenceAreaProductRelation> delete(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.instance(cmsPrefrenceAreaProductRelationService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<CmsPrefrenceAreaProductRelation> queryById(@Parameter(name = "主键", required = true)
                                                             @PathVariable(value = "id") String id) {
        return Result.success(cmsPrefrenceAreaProductRelationService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<CmsPrefrenceAreaProductRelation>> queryAll() {
        return Result.success(cmsPrefrenceAreaProductRelationService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<CmsPrefrenceAreaProductRelation>> queryPage(@RequestBody PageParam page) {
        return Result.success(cmsPrefrenceAreaProductRelationService.queryPage(page, null));
    }

}
