package com.rystars.mall.admin.pms.product.controller;

import com.rystars.mall.admin.pms.product.bean.PmsProductLadder;
import com.rystars.mall.admin.pms.product.service.PmsProductLadderService;
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
 * 【pms_product_ladder(产品阶梯价格表(只针对同商品))】Controller
 * @author rystars
 * @date 2023-04-13 10:50:57
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/product/ladder")
@Tag(name = "PmsProductLadderController", description = "产品阶梯价格表(只针对同商品)")
public class PmsProductLadderController {

    private final PmsProductLadderService pmsProductLadderService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<PmsProductLadder> save(@Parameter(name = "产品阶梯价格表(只针对同商品)", required = true)
                                                     @RequestBody PmsProductLadder pmsProductLadder) {
        return Result.instance(pmsProductLadderService.save(pmsProductLadder));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<PmsProductLadder> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody PmsProductLadder pmsProductLadder) {
        boolean result = pmsProductLadderService.update(pmsProductLadder, new UpdateWrapper<PmsProductLadder>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<PmsProductLadder> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(pmsProductLadderService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<PmsProductLadder> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(pmsProductLadderService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<PmsProductLadder>> queryAll() {
        return Result.success(pmsProductLadderService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<PmsProductLadder>> queryPage(@RequestBody PageParam page) {
        return Result.success(pmsProductLadderService.queryPage(page, null));
    }

}
