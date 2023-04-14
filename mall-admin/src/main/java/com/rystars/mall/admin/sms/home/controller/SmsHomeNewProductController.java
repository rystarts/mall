package com.rystars.mall.admin.sms.home.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.sms.home.bean.SmsHomeNewProduct;
import com.rystars.mall.admin.sms.home.service.SmsHomeNewProductService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【sms_home_new_product(新鲜好物表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:12:11
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sms/home/new/product")
@Tag(name = "SmsHomeNewProductController", description = "新鲜好物表")
public class SmsHomeNewProductController implements IBaseController<SmsHomeNewProductService, SmsHomeNewProduct> {

    private final SmsHomeNewProductService smsHomeNewProductService;

    @Override
    public SmsHomeNewProductService getService() {
        return smsHomeNewProductService;
    }

}
