package com.rystars.mall.admin.sms.coupon.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.sms.coupon.bean.SmsCouponHistory;
import com.rystars.mall.admin.sms.coupon.service.SmsCouponHistoryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【sms_coupon_history(优惠券使用、领取历史表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:11:50
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sms/coupon/history")
@Tag(name = "SmsCouponHistoryController", description = "优惠券使用、领取历史表")
public class SmsCouponHistoryController implements IBaseController<SmsCouponHistoryService, SmsCouponHistory> {

    private final SmsCouponHistoryService smsCouponHistoryService;

    @Override
    public SmsCouponHistoryService getService() {
        return smsCouponHistoryService;
    }

}
