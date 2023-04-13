package com.rystars.mall.admin.sms.coupon.service.impl;

import com.rystars.mall.admin.sms.coupon.bean.SmsCouponProductRelation;
import com.rystars.mall.admin.sms.coupon.service.SmsCouponProductRelationService;
import com.rystars.mall.admin.sms.coupon.mapper.SmsCouponProductRelationMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【sms_coupon_product_relation(优惠券和产品的关系表)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:54:23
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class SmsCouponProductRelationServiceImpl extends IBaseServiceImpl<SmsCouponProductRelationMapper, SmsCouponProductRelation> implements SmsCouponProductRelationService{

    private final SmsCouponProductRelationMapper smsCouponProductRelationMapper;

}




