package com.rystars.mall.admin.sms.coupon.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.sms.coupon.bean.SmsCouponHistory;
import com.rystars.mall.admin.sms.coupon.mapper.SmsCouponHistoryMapper;
import com.rystars.mall.admin.sms.coupon.service.SmsCouponHistoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【sms_coupon_history(优惠券使用、领取历史表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:11:50
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class SmsCouponHistoryServiceImpl extends IBaseServiceImpl<SmsCouponHistoryMapper, SmsCouponHistory> implements SmsCouponHistoryService {

    private final SmsCouponHistoryMapper smsCouponHistoryMapper;

}




