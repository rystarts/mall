package com.rystars.mall.admin.sms.flash.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.sms.flash.bean.SmsFlashPromotionSession;
import com.rystars.mall.admin.sms.flash.service.SmsFlashPromotionSessionService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【sms_flash_promotion_session(限时购场次表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:12:02
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sms/flash/promotion/session")
@Tag(name = "SmsFlashPromotionSessionController", description = "限时购场次表")
public class SmsFlashPromotionSessionController implements IBaseController<SmsFlashPromotionSessionService, SmsFlashPromotionSession> {

    private final SmsFlashPromotionSessionService smsFlashPromotionSessionService;

    @Override
    public SmsFlashPromotionSessionService getService() {
        return smsFlashPromotionSessionService;
    }

}
