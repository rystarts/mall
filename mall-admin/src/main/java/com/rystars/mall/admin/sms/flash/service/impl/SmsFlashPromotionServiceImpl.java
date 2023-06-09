package com.rystars.mall.admin.sms.flash.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.sms.flash.bean.SmsFlashPromotion;
import com.rystars.mall.admin.sms.flash.mapper.SmsFlashPromotionMapper;
import com.rystars.mall.admin.sms.flash.service.SmsFlashPromotionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【sms_flash_promotion(限时购表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:12:02
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class SmsFlashPromotionServiceImpl extends IBaseServiceImpl<SmsFlashPromotionMapper, SmsFlashPromotion> implements SmsFlashPromotionService {

    private final SmsFlashPromotionMapper smsFlashPromotionMapper;

}




