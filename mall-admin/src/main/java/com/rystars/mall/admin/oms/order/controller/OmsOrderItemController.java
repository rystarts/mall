package com.rystars.mall.admin.oms.order.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.oms.order.bean.OmsOrderItem;
import com.rystars.mall.admin.oms.order.service.OmsOrderItemService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【oms_order_item(订单中所包含的商品)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:43:37
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/oms/order/item")
@Tag(name = "OmsOrderItemController", description = "订单中所包含的商品")
public class OmsOrderItemController {

    private final OmsOrderItemService omsOrderItemService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<OmsOrderItem> save(@Parameter(name = "订单中所包含的商品", required = true)
                                     @RequestBody OmsOrderItem omsOrderItem) {
        return Result.instance(omsOrderItemService.save(omsOrderItem));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<OmsOrderItem> update(@Parameter(name = "主键", required = true)
                                       @PathVariable(value = "id") String id,
                                       @RequestBody OmsOrderItem omsOrderItem) {
        boolean result = omsOrderItemService.update(omsOrderItem, new UpdateWrapper<OmsOrderItem>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<OmsOrderItem> delete(@Parameter(name = "主键", required = true)
                                       @PathVariable(value = "id") String id) {
        return Result.instance(omsOrderItemService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<OmsOrderItem> queryById(@Parameter(name = "主键", required = true)
                                          @PathVariable(value = "id") String id) {
        return Result.success(omsOrderItemService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<OmsOrderItem>> queryAll() {
        return Result.success(omsOrderItemService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<OmsOrderItem>> queryPage(@RequestBody PageParam page) {
        return Result.success(omsOrderItemService.queryPage(page, null));
    }

}
