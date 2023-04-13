package com.rystars.mall.admin.sms.coupon.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.sms.coupon.bean.SmsCoupon;
import com.rystars.mall.admin.sms.coupon.service.SmsCouponService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【sms_coupon(优惠券表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:54:23
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sms/coupon")
@Tag(name = "SmsCouponController", description = "优惠券表")
public class SmsCouponController {

    private final SmsCouponService smsCouponService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<SmsCoupon> save(@Parameter(name = "优惠券表", required = true)
                                  @RequestBody SmsCoupon smsCoupon) {
        return Result.instance(smsCouponService.save(smsCoupon));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<SmsCoupon> update(@Parameter(name = "主键", required = true)
                                    @PathVariable(value = "id") String id,
                                    @RequestBody SmsCoupon smsCoupon) {
        boolean result = smsCouponService.update(smsCoupon, new UpdateWrapper<SmsCoupon>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<SmsCoupon> delete(@Parameter(name = "主键", required = true)
                                    @PathVariable(value = "id") String id) {
        return Result.instance(smsCouponService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<SmsCoupon> queryById(@Parameter(name = "主键", required = true)
                                       @PathVariable(value = "id") String id) {
        return Result.success(smsCouponService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<SmsCoupon>> queryAll() {
        return Result.success(smsCouponService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<SmsCoupon>> queryPage(@RequestBody PageParam page) {
        return Result.success(smsCouponService.queryPage(page, null));
    }

}
