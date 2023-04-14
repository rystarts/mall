package com.rystars.mall.admin.sms.home.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.sms.home.bean.SmsHomeRecommendProduct;
import com.rystars.mall.admin.sms.home.service.SmsHomeRecommendProductService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【sms_home_recommend_product(人气推荐商品表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:12:11
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sms/home/recommend/product")
@Tag(name = "SmsHomeRecommendProductController", description = "人气推荐商品表")
public class SmsHomeRecommendProductController implements IBaseController<SmsHomeRecommendProductService, SmsHomeRecommendProduct> {

    private final SmsHomeRecommendProductService smsHomeRecommendProductService;

    @Override
    public SmsHomeRecommendProductService getService() {
        return smsHomeRecommendProductService;
    }

}
