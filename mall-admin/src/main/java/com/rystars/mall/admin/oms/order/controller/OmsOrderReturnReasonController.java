package com.rystars.mall.admin.oms.order.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.oms.order.bean.OmsOrderReturnReason;
import com.rystars.mall.admin.oms.order.service.OmsOrderReturnReasonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【oms_order_return_reason(退货原因表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:43:38
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/oms/order/return/reason")
@Tag(name = "OmsOrderReturnReasonController", description = "退货原因表")
public class OmsOrderReturnReasonController {

    private final OmsOrderReturnReasonService omsOrderReturnReasonService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<OmsOrderReturnReason> save(@Parameter(name = "退货原因表", required = true)
                                             @RequestBody OmsOrderReturnReason omsOrderReturnReason) {
        return Result.instance(omsOrderReturnReasonService.save(omsOrderReturnReason));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<OmsOrderReturnReason> update(@Parameter(name = "主键", required = true)
                                               @PathVariable(value = "id") String id,
                                               @RequestBody OmsOrderReturnReason omsOrderReturnReason) {
        boolean result = omsOrderReturnReasonService.update(omsOrderReturnReason, new UpdateWrapper<OmsOrderReturnReason>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<OmsOrderReturnReason> delete(@Parameter(name = "主键", required = true)
                                               @PathVariable(value = "id") String id) {
        return Result.instance(omsOrderReturnReasonService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<OmsOrderReturnReason> queryById(@Parameter(name = "主键", required = true)
                                                  @PathVariable(value = "id") String id) {
        return Result.success(omsOrderReturnReasonService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<OmsOrderReturnReason>> queryAll() {
        return Result.success(omsOrderReturnReasonService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<OmsOrderReturnReason>> queryPage(@RequestBody PageParam page) {
        return Result.success(omsOrderReturnReasonService.queryPage(page, null));
    }

}
