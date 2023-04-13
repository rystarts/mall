package com.rystars.mall.admin.sms.flash.service.impl;

import com.rystars.mall.admin.sms.flash.bean.SmsFlashPromotionLog;
import com.rystars.mall.admin.sms.flash.service.SmsFlashPromotionLogService;
import com.rystars.mall.admin.sms.flash.mapper.SmsFlashPromotionLogMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【sms_flash_promotion_log(限时购通知记录)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:54:34
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class SmsFlashPromotionLogServiceImpl extends IBaseServiceImpl<SmsFlashPromotionLogMapper, SmsFlashPromotionLog> implements SmsFlashPromotionLogService{

    private final SmsFlashPromotionLogMapper smsFlashPromotionLogMapper;

}



