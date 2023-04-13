package com.rystars.mall.admin.sms.coupon.controller;

import com.rystars.mall.admin.sms.coupon.bean.SmsCouponProductCategoryRelation;
import com.rystars.mall.admin.sms.coupon.service.SmsCouponProductCategoryRelationService;
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
 * 【sms_coupon_product_category_relation(优惠券和产品分类关系表)】Controller
 * @author rystars
 * @date 2023-04-13 10:54:23
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sms/coupon/product/category/relation")
@Tag(name = "SmsCouponProductCategoryRelationController", description = "优惠券和产品分类关系表")
public class SmsCouponProductCategoryRelationController {

    private final SmsCouponProductCategoryRelationService smsCouponProductCategoryRelationService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<SmsCouponProductCategoryRelation> save(@Parameter(name = "优惠券和产品分类关系表", required = true)
                                                     @RequestBody SmsCouponProductCategoryRelation smsCouponProductCategoryRelation) {
        return Result.instance(smsCouponProductCategoryRelationService.save(smsCouponProductCategoryRelation));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<SmsCouponProductCategoryRelation> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody SmsCouponProductCategoryRelation smsCouponProductCategoryRelation) {
        boolean result = smsCouponProductCategoryRelationService.update(smsCouponProductCategoryRelation, new UpdateWrapper<SmsCouponProductCategoryRelation>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<SmsCouponProductCategoryRelation> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(smsCouponProductCategoryRelationService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<SmsCouponProductCategoryRelation> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(smsCouponProductCategoryRelationService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<SmsCouponProductCategoryRelation>> queryAll() {
        return Result.success(smsCouponProductCategoryRelationService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<SmsCouponProductCategoryRelation>> queryPage(@RequestBody PageParam page) {
        return Result.success(smsCouponProductCategoryRelationService.queryPage(page, null));
    }

}
