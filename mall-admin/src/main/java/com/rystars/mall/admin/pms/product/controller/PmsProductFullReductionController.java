package com.rystars.mall.admin.pms.product.controller;

import com.rystars.mall.admin.pms.product.bean.PmsProductFullReduction;
import com.rystars.mall.admin.pms.product.service.PmsProductFullReductionService;
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
 * 【pms_product_full_reduction(产品满减表(只针对同商品))】Controller
 * @author rystars
 * @date 2023-04-13 10:50:57
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/product/full/reduction")
@Tag(name = "PmsProductFullReductionController", description = "产品满减表(只针对同商品)")
public class PmsProductFullReductionController {

    private final PmsProductFullReductionService pmsProductFullReductionService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<PmsProductFullReduction> save(@Parameter(name = "产品满减表(只针对同商品)", required = true)
                                                     @RequestBody PmsProductFullReduction pmsProductFullReduction) {
        return Result.instance(pmsProductFullReductionService.save(pmsProductFullReduction));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<PmsProductFullReduction> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody PmsProductFullReduction pmsProductFullReduction) {
        boolean result = pmsProductFullReductionService.update(pmsProductFullReduction, new UpdateWrapper<PmsProductFullReduction>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<PmsProductFullReduction> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(pmsProductFullReductionService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<PmsProductFullReduction> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(pmsProductFullReductionService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<PmsProductFullReduction>> queryAll() {
        return Result.success(pmsProductFullReductionService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<PmsProductFullReduction>> queryPage(@RequestBody PageParam page) {
        return Result.success(pmsProductFullReductionService.queryPage(page, null));
    }

}
