package com.rystars.mall.admin.oms.order.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.oms.order.bean.OmsOrderSetting;
import com.rystars.mall.admin.oms.order.service.OmsOrderSettingService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【oms_order_setting(订单设置表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:43:38
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/oms/order/setting")
@Tag(name = "OmsOrderSettingController", description = "订单设置表")
public class OmsOrderSettingController {

    private final OmsOrderSettingService omsOrderSettingService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<OmsOrderSetting> save(@Parameter(name = "订单设置表", required = true)
                                        @RequestBody OmsOrderSetting omsOrderSetting) {
        return Result.instance(omsOrderSettingService.save(omsOrderSetting));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<OmsOrderSetting> update(@Parameter(name = "主键", required = true)
                                          @PathVariable(value = "id") String id,
                                          @RequestBody OmsOrderSetting omsOrderSetting) {
        boolean result = omsOrderSettingService.update(omsOrderSetting, new UpdateWrapper<OmsOrderSetting>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<OmsOrderSetting> delete(@Parameter(name = "主键", required = true)
                                          @PathVariable(value = "id") String id) {
        return Result.instance(omsOrderSettingService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<OmsOrderSetting> queryById(@Parameter(name = "主键", required = true)
                                             @PathVariable(value = "id") String id) {
        return Result.success(omsOrderSettingService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<OmsOrderSetting>> queryAll() {
        return Result.success(omsOrderSettingService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<OmsOrderSetting>> queryPage(@RequestBody PageParam page) {
        return Result.success(omsOrderSettingService.queryPage(page, null));
    }

}
