package com.rystars.mall.admin.sms.coupon.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.sms.coupon.bean.SmsCouponProductRelation;
import com.rystars.mall.admin.sms.coupon.service.SmsCouponProductRelationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【sms_coupon_product_relation(优惠券和产品的关系表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:11:50
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sms/coupon/product/relation")
@Tag(name = "SmsCouponProductRelationController", description = "优惠券和产品的关系表")
public class SmsCouponProductRelationController implements IBaseController<SmsCouponProductRelationService, SmsCouponProductRelation> {

    private final SmsCouponProductRelationService smsCouponProductRelationService;

    @Override
    public SmsCouponProductRelationService getService() {
        return smsCouponProductRelationService;
    }

}
