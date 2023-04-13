package com.rystars.mall.admin.pms.feight.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.pms.feight.bean.PmsFeightTemplate;
import com.rystars.mall.admin.pms.feight.service.PmsFeightTemplateService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【pms_feight_template(运费模版)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:50:37
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/feight/template")
@Tag(name = "PmsFeightTemplateController", description = "运费模版")
public class PmsFeightTemplateController {

    private final PmsFeightTemplateService pmsFeightTemplateService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<PmsFeightTemplate> save(@Parameter(name = "运费模版", required = true)
                                          @RequestBody PmsFeightTemplate pmsFeightTemplate) {
        return Result.instance(pmsFeightTemplateService.save(pmsFeightTemplate));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<PmsFeightTemplate> update(@Parameter(name = "主键", required = true)
                                            @PathVariable(value = "id") String id,
                                            @RequestBody PmsFeightTemplate pmsFeightTemplate) {
        boolean result = pmsFeightTemplateService.update(pmsFeightTemplate, new UpdateWrapper<PmsFeightTemplate>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<PmsFeightTemplate> delete(@Parameter(name = "主键", required = true)
                                            @PathVariable(value = "id") String id) {
        return Result.instance(pmsFeightTemplateService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<PmsFeightTemplate> queryById(@Parameter(name = "主键", required = true)
                                               @PathVariable(value = "id") String id) {
        return Result.success(pmsFeightTemplateService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<PmsFeightTemplate>> queryAll() {
        return Result.success(pmsFeightTemplateService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<PmsFeightTemplate>> queryPage(@RequestBody PageParam page) {
        return Result.success(pmsFeightTemplateService.queryPage(page, null));
    }

}
