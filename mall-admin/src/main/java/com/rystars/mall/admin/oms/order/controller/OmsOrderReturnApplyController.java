package com.rystars.mall.admin.oms.order.controller;

import com.rystars.mall.admin.oms.order.bean.OmsOrderReturnApply;
import com.rystars.mall.admin.oms.order.service.OmsOrderReturnApplyService;
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
 * 【oms_order_return_apply(订单退货申请)】Controller
 * @author rystars
 * @date 2023-04-13 10:43:38
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/oms/order/return/apply")
@Tag(name = "OmsOrderReturnApplyController", description = "订单退货申请")
public class OmsOrderReturnApplyController {

    private final OmsOrderReturnApplyService omsOrderReturnApplyService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<OmsOrderReturnApply> save(@Parameter(name = "订单退货申请", required = true)
                                                     @RequestBody OmsOrderReturnApply omsOrderReturnApply) {
        return Result.instance(omsOrderReturnApplyService.save(omsOrderReturnApply));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<OmsOrderReturnApply> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody OmsOrderReturnApply omsOrderReturnApply) {
        boolean result = omsOrderReturnApplyService.update(omsOrderReturnApply, new UpdateWrapper<OmsOrderReturnApply>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<OmsOrderReturnApply> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(omsOrderReturnApplyService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<OmsOrderReturnApply> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(omsOrderReturnApplyService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<OmsOrderReturnApply>> queryAll() {
        return Result.success(omsOrderReturnApplyService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<OmsOrderReturnApply>> queryPage(@RequestBody PageParam page) {
        return Result.success(omsOrderReturnApplyService.queryPage(page, null));
    }

}
