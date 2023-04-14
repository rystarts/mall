package com.rystars.mall.admin.sms.coupon.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.sms.coupon.bean.SmsCouponProductCategoryRelation;
import com.rystars.mall.admin.sms.coupon.service.SmsCouponProductCategoryRelationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【sms_coupon_product_category_relation(优惠券和产品分类关系表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:11:50
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sms/coupon/product/category/relation")
@Tag(name = "SmsCouponProductCategoryRelationController", description = "优惠券和产品分类关系表")
public class SmsCouponProductCategoryRelationController implements IBaseController<SmsCouponProductCategoryRelationService, SmsCouponProductCategoryRelation> {

    private final SmsCouponProductCategoryRelationService smsCouponProductCategoryRelationService;

    @Override
    public SmsCouponProductCategoryRelationService getService() {
        return smsCouponProductCategoryRelationService;
    }

}
