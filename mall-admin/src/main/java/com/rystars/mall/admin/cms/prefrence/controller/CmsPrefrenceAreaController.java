package com.rystars.mall.admin.cms.prefrence.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.cms.prefrence.bean.CmsPrefrenceArea;
import com.rystars.mall.admin.cms.prefrence.service.CmsPrefrenceAreaService;
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
 * 【cms_prefrence_area(优选专区)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:38:54
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cms/prefrence/area")
@Tag(name = "CmsPrefrenceAreaController", description = "优选专区")
public class CmsPrefrenceAreaController {

    private final CmsPrefrenceAreaService cmsPrefrenceAreaService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<CmsPrefrenceArea> save(@Parameter(name = "优选专区", required = true)
                                         @RequestBody CmsPrefrenceArea cmsPrefrenceArea) {
        return Result.instance(cmsPrefrenceAreaService.save(cmsPrefrenceArea));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<CmsPrefrenceArea> update(@Parameter(name = "主键", required = true)
                                           @PathVariable(value = "id") String id,
                                           @RequestBody CmsPrefrenceArea cmsPrefrenceArea) {
        boolean result = cmsPrefrenceAreaService.update(cmsPrefrenceArea, new UpdateWrapper<CmsPrefrenceArea>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<CmsPrefrenceArea> delete(@Parameter(name = "主键", required = true)
                                           @PathVariable(value = "id") String id) {
        return Result.instance(cmsPrefrenceAreaService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<CmsPrefrenceArea> queryById(@Parameter(name = "主键", required = true)
                                              @PathVariable(value = "id") String id) {
        return Result.success(cmsPrefrenceAreaService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<CmsPrefrenceArea>> queryAll() {
        return Result.success(cmsPrefrenceAreaService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<CmsPrefrenceArea>> queryPage(@RequestBody PageParam page) {
        return Result.success(cmsPrefrenceAreaService.queryPage(page, null));
    }

}
