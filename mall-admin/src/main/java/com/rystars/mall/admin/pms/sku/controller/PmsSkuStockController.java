package com.rystars.mall.admin.pms.sku.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.pms.sku.bean.PmsSkuStock;
import com.rystars.mall.admin.pms.sku.service.PmsSkuStockService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【pms_sku_stock(sku的库存)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:51:06
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/sku/stock")
@Tag(name = "PmsSkuStockController", description = "sku的库存")
public class PmsSkuStockController {

    private final PmsSkuStockService pmsSkuStockService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<PmsSkuStock> save(@Parameter(name = "sku的库存", required = true)
                                    @RequestBody PmsSkuStock pmsSkuStock) {
        return Result.instance(pmsSkuStockService.save(pmsSkuStock));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<PmsSkuStock> update(@Parameter(name = "主键", required = true)
                                      @PathVariable(value = "id") String id,
                                      @RequestBody PmsSkuStock pmsSkuStock) {
        boolean result = pmsSkuStockService.update(pmsSkuStock, new UpdateWrapper<PmsSkuStock>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<PmsSkuStock> delete(@Parameter(name = "主键", required = true)
                                      @PathVariable(value = "id") String id) {
        return Result.instance(pmsSkuStockService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<PmsSkuStock> queryById(@Parameter(name = "主键", required = true)
                                         @PathVariable(value = "id") String id) {
        return Result.success(pmsSkuStockService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<PmsSkuStock>> queryAll() {
        return Result.success(pmsSkuStockService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<PmsSkuStock>> queryPage(@RequestBody PageParam page) {
        return Result.success(pmsSkuStockService.queryPage(page, null));
    }

}
