package com.rystars.mall.admin.sms.flash.service.impl;

import com.rystars.mall.admin.sms.flash.bean.SmsFlashPromotionProductRelation;
import com.rystars.mall.admin.sms.flash.service.SmsFlashPromotionProductRelationService;
import com.rystars.mall.admin.sms.flash.mapper.SmsFlashPromotionProductRelationMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【sms_flash_promotion_product_relation(商品限时购与商品关系表)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:54:34
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class SmsFlashPromotionProductRelationServiceImpl extends IBaseServiceImpl<SmsFlashPromotionProductRelationMapper, SmsFlashPromotionProductRelation> implements SmsFlashPromotionProductRelationService{

    private final SmsFlashPromotionProductRelationMapper smsFlashPromotionProductRelationMapper;

}




