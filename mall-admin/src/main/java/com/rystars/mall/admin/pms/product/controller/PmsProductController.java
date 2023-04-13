package com.rystars.mall.admin.pms.product.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.pms.product.bean.PmsProduct;
import com.rystars.mall.admin.pms.product.service.PmsProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【pms_product(商品信息)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:50:56
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/product")
@Tag(name = "PmsProductController", description = "商品信息")
public class PmsProductController {

    private final PmsProductService pmsProductService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<PmsProduct> save(@Parameter(name = "商品信息", required = true)
                                   @RequestBody PmsProduct pmsProduct) {
        return Result.instance(pmsProductService.save(pmsProduct));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<PmsProduct> update(@Parameter(name = "主键", required = true)
                                     @PathVariable(value = "id") String id,
                                     @RequestBody PmsProduct pmsProduct) {
        boolean result = pmsProductService.update(pmsProduct, new UpdateWrapper<PmsProduct>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<PmsProduct> delete(@Parameter(name = "主键", required = true)
                                     @PathVariable(value = "id") String id) {
        return Result.instance(pmsProductService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<PmsProduct> queryById(@Parameter(name = "主键", required = true)
                                        @PathVariable(value = "id") String id) {
        return Result.success(pmsProductService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<PmsProduct>> queryAll() {
        return Result.success(pmsProductService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<PmsProduct>> queryPage(@RequestBody PageParam page) {
        return Result.success(pmsProductService.queryPage(page, null));
    }

}
