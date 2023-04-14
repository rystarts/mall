package com.rystars.mall.admin.sms.coupon.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.sms.coupon.bean.SmsCoupon;
import com.rystars.mall.admin.sms.coupon.service.SmsCouponService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【sms_coupon(优惠券表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:11:49
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sms/coupon")
@Tag(name = "SmsCouponController", description = "优惠券表")
public class SmsCouponController implements IBaseController<SmsCouponService, SmsCoupon> {

    private final SmsCouponService smsCouponService;

    @Override
    public SmsCouponService getService() {
        return smsCouponService;
    }

}
