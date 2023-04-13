package com.rystars.mall.admin.sms.coupon.controller;

import com.rystars.mall.admin.sms.coupon.bean.SmsCouponHistory;
import com.rystars.mall.admin.sms.coupon.service.SmsCouponHistoryService;
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
 * 【sms_coupon_history(优惠券使用、领取历史表)】Controller
 * @author rystars
 * @date 2023-04-13 10:54:23
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sms/coupon/history")
@Tag(name = "SmsCouponHistoryController", description = "优惠券使用、领取历史表")
public class SmsCouponHistoryController {

    private final SmsCouponHistoryService smsCouponHistoryService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<SmsCouponHistory> save(@Parameter(name = "优惠券使用、领取历史表", required = true)
                                                     @RequestBody SmsCouponHistory smsCouponHistory) {
        return Result.instance(smsCouponHistoryService.save(smsCouponHistory));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<SmsCouponHistory> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody SmsCouponHistory smsCouponHistory) {
        boolean result = smsCouponHistoryService.update(smsCouponHistory, new UpdateWrapper<SmsCouponHistory>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<SmsCouponHistory> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(smsCouponHistoryService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<SmsCouponHistory> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(smsCouponHistoryService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<SmsCouponHistory>> queryAll() {
        return Result.success(smsCouponHistoryService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<SmsCouponHistory>> queryPage(@RequestBody PageParam page) {
        return Result.success(smsCouponHistoryService.queryPage(page, null));
    }

}
