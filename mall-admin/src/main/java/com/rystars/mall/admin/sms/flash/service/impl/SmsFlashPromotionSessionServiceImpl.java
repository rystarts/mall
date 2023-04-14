package com.rystars.mall.admin.sms.flash.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.sms.flash.bean.SmsFlashPromotionSession;
import com.rystars.mall.admin.sms.flash.mapper.SmsFlashPromotionSessionMapper;
import com.rystars.mall.admin.sms.flash.service.SmsFlashPromotionSessionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【sms_flash_promotion_session(限时购场次表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:12:02
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class SmsFlashPromotionSessionServiceImpl extends IBaseServiceImpl<SmsFlashPromotionSessionMapper, SmsFlashPromotionSession> implements SmsFlashPromotionSessionService {

    private final SmsFlashPromotionSessionMapper smsFlashPromotionSessionMapper;

}




