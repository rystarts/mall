package com.rystars.mall.admin.sms.flash.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.sms.flash.bean.SmsFlashPromotion;
import com.rystars.mall.admin.sms.flash.service.SmsFlashPromotionService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【sms_flash_promotion(限时购表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:12:02
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sms/flash/promotion")
@Tag(name = "SmsFlashPromotionController", description = "限时购表")
public class SmsFlashPromotionController implements IBaseController<SmsFlashPromotionService, SmsFlashPromotion> {

    private final SmsFlashPromotionService smsFlashPromotionService;

    @Override
    public SmsFlashPromotionService getService() {
        return smsFlashPromotionService;
    }

}
