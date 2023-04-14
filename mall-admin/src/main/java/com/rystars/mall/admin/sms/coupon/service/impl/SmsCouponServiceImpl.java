package com.rystars.mall.admin.sms.coupon.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.sms.coupon.bean.SmsCoupon;
import com.rystars.mall.admin.sms.coupon.mapper.SmsCouponMapper;
import com.rystars.mall.admin.sms.coupon.service.SmsCouponService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【sms_coupon(优惠券表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:11:49
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class SmsCouponServiceImpl extends IBaseServiceImpl<SmsCouponMapper, SmsCoupon> implements SmsCouponService {

    private final SmsCouponMapper smsCouponMapper;

}




