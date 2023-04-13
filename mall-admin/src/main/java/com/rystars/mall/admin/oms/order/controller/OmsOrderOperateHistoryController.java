package com.rystars.mall.admin.oms.order.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.oms.order.bean.OmsOrderOperateHistory;
import com.rystars.mall.admin.oms.order.service.OmsOrderOperateHistoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【oms_order_operate_history(订单操作历史记录)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:43:38
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/oms/order/operate/history")
@Tag(name = "OmsOrderOperateHistoryController", description = "订单操作历史记录")
public class OmsOrderOperateHistoryController {

    private final OmsOrderOperateHistoryService omsOrderOperateHistoryService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<OmsOrderOperateHistory> save(@Parameter(name = "订单操作历史记录", required = true)
                                               @RequestBody OmsOrderOperateHistory omsOrderOperateHistory) {
        return Result.instance(omsOrderOperateHistoryService.save(omsOrderOperateHistory));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<OmsOrderOperateHistory> update(@Parameter(name = "主键", required = true)
                                                 @PathVariable(value = "id") String id,
                                                 @RequestBody OmsOrderOperateHistory omsOrderOperateHistory) {
        boolean result = omsOrderOperateHistoryService.update(omsOrderOperateHistory, new UpdateWrapper<OmsOrderOperateHistory>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<OmsOrderOperateHistory> delete(@Parameter(name = "主键", required = true)
                                                 @PathVariable(value = "id") String id) {
        return Result.instance(omsOrderOperateHistoryService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<OmsOrderOperateHistory> queryById(@Parameter(name = "主键", required = true)
                                                    @PathVariable(value = "id") String id) {
        return Result.success(omsOrderOperateHistoryService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<OmsOrderOperateHistory>> queryAll() {
        return Result.success(omsOrderOperateHistoryService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<OmsOrderOperateHistory>> queryPage(@RequestBody PageParam page) {
        return Result.success(omsOrderOperateHistoryService.queryPage(page, null));
    }

}
