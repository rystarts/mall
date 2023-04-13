package com.rystars.mall.admin.sms.coupon.service.impl;

import com.rystars.mall.admin.sms.coupon.bean.SmsCouponProductCategoryRelation;
import com.rystars.mall.admin.sms.coupon.service.SmsCouponProductCategoryRelationService;
import com.rystars.mall.admin.sms.coupon.mapper.SmsCouponProductCategoryRelationMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【sms_coupon_product_category_relation(优惠券和产品分类关系表)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:54:23
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class SmsCouponProductCategoryRelationServiceImpl extends IBaseServiceImpl<SmsCouponProductCategoryRelationMapper, SmsCouponProductCategoryRelation> implements SmsCouponProductCategoryRelationService{

    private final SmsCouponProductCategoryRelationMapper smsCouponProductCategoryRelationMapper;

}




