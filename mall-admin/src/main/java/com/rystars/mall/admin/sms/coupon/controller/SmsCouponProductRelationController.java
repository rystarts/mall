package com.rystars.mall.admin.sms.coupon.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.sms.coupon.bean.SmsCouponProductRelation;
import com.rystars.mall.admin.sms.coupon.service.SmsCouponProductRelationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【sms_coupon_product_relation(优惠券和产品的关系表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:54:23
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sms/coupon/product/relation")
@Tag(name = "SmsCouponProductRelationController", description = "优惠券和产品的关系表")
public class SmsCouponProductRelationController {

    private final SmsCouponProductRelationService smsCouponProductRelationService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<SmsCouponProductRelation> save(@Parameter(name = "优惠券和产品的关系表", required = true)
                                                 @RequestBody SmsCouponProductRelation smsCouponProductRelation) {
        return Result.instance(smsCouponProductRelationService.save(smsCouponProductRelation));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<SmsCouponProductRelation> update(@Parameter(name = "主键", required = true)
                                                   @PathVariable(value = "id") String id,
                                                   @RequestBody SmsCouponProductRelation smsCouponProductRelation) {
        boolean result = smsCouponProductRelationService.update(smsCouponProductRelation, new UpdateWrapper<SmsCouponProductRelation>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<SmsCouponProductRelation> delete(@Parameter(name = "主键", required = true)
                                                   @PathVariable(value = "id") String id) {
        return Result.instance(smsCouponProductRelationService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<SmsCouponProductRelation> queryById(@Parameter(name = "主键", required = true)
                                                      @PathVariable(value = "id") String id) {
        return Result.success(smsCouponProductRelationService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<SmsCouponProductRelation>> queryAll() {
        return Result.success(smsCouponProductRelationService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<SmsCouponProductRelation>> queryPage(@RequestBody PageParam page) {
        return Result.success(smsCouponProductRelationService.queryPage(page, null));
    }

}
