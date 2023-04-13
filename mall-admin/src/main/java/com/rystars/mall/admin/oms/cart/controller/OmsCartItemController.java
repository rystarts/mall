package com.rystars.mall.admin.oms.cart.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.oms.cart.bean.OmsCartItem;
import com.rystars.mall.admin.oms.cart.service.OmsCartItemService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【oms_cart_item(购物车表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:43:19
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/oms/cart/item")
@Tag(name = "OmsCartItemController", description = "购物车表")
public class OmsCartItemController {

    private final OmsCartItemService omsCartItemService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<OmsCartItem> save(@Parameter(name = "购物车表", required = true)
                                    @RequestBody OmsCartItem omsCartItem) {
        return Result.instance(omsCartItemService.save(omsCartItem));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<OmsCartItem> update(@Parameter(name = "主键", required = true)
                                      @PathVariable(value = "id") String id,
                                      @RequestBody OmsCartItem omsCartItem) {
        boolean result = omsCartItemService.update(omsCartItem, new UpdateWrapper<OmsCartItem>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<OmsCartItem> delete(@Parameter(name = "主键", required = true)
                                      @PathVariable(value = "id") String id) {
        return Result.instance(omsCartItemService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<OmsCartItem> queryById(@Parameter(name = "主键", required = true)
                                         @PathVariable(value = "id") String id) {
        return Result.success(omsCartItemService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<OmsCartItem>> queryAll() {
        return Result.success(omsCartItemService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<OmsCartItem>> queryPage(@RequestBody PageParam page) {
        return Result.success(omsCartItemService.queryPage(page, null));
    }

}
