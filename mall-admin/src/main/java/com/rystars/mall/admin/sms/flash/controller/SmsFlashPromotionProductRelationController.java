package com.rystars.mall.admin.sms.flash.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.sms.flash.bean.SmsFlashPromotionProductRelation;
import com.rystars.mall.admin.sms.flash.service.SmsFlashPromotionProductRelationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【sms_flash_promotion_product_relation(商品限时购与商品关系表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:12:02
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sms/flash/promotion/product/relation")
@Tag(name = "SmsFlashPromotionProductRelationController", description = "商品限时购与商品关系表")
public class SmsFlashPromotionProductRelationController implements IBaseController<SmsFlashPromotionProductRelationService, SmsFlashPromotionProductRelation> {

    private final SmsFlashPromotionProductRelationService smsFlashPromotionProductRelationService;

    @Override
    public SmsFlashPromotionProductRelationService getService() {
        return smsFlashPromotionProductRelationService;
    }

}
