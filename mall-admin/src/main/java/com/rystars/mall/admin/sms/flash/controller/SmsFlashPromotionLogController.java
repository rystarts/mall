package com.rystars.mall.admin.sms.flash.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.sms.flash.bean.SmsFlashPromotionLog;
import com.rystars.mall.admin.sms.flash.service.SmsFlashPromotionLogService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【sms_flash_promotion_log(限时购通知记录)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:12:02
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sms/flash/promotion/log")
@Tag(name = "SmsFlashPromotionLogController", description = "限时购通知记录")
public class SmsFlashPromotionLogController implements IBaseController<SmsFlashPromotionLogService, SmsFlashPromotionLog> {

    private final SmsFlashPromotionLogService smsFlashPromotionLogService;

    @Override
    public SmsFlashPromotionLogService getService() {
        return smsFlashPromotionLogService;
    }

}
