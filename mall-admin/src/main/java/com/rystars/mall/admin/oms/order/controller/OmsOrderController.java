package com.rystars.mall.admin.oms.order.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.oms.order.bean.OmsOrder;
import com.rystars.mall.admin.oms.order.service.OmsOrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【oms_order(订单表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:43:37
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/oms/order")
@Tag(name = "OmsOrderController", description = "订单表")
public class OmsOrderController {

    private final OmsOrderService omsOrderService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<OmsOrder> save(@Parameter(name = "订单表", required = true)
                                 @RequestBody OmsOrder omsOrder) {
        return Result.instance(omsOrderService.save(omsOrder));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<OmsOrder> update(@Parameter(name = "主键", required = true)
                                   @PathVariable(value = "id") String id,
                                   @RequestBody OmsOrder omsOrder) {
        boolean result = omsOrderService.update(omsOrder, new UpdateWrapper<OmsOrder>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<OmsOrder> delete(@Parameter(name = "主键", required = true)
                                   @PathVariable(value = "id") String id) {
        return Result.instance(omsOrderService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<OmsOrder> queryById(@Parameter(name = "主键", required = true)
                                      @PathVariable(value = "id") String id) {
        return Result.success(omsOrderService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<OmsOrder>> queryAll() {
        return Result.success(omsOrderService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<OmsOrder>> queryPage(@RequestBody PageParam page) {
        return Result.success(omsOrderService.queryPage(page, null));
    }

}
