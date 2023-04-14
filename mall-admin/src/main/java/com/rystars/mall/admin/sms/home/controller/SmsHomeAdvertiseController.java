package com.rystars.mall.admin.sms.home.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.sms.home.bean.SmsHomeAdvertise;
import com.rystars.mall.admin.sms.home.service.SmsHomeAdvertiseService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【sms_home_advertise(首页轮播广告表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:12:10
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sms/home/advertise")
@Tag(name = "SmsHomeAdvertiseController", description = "首页轮播广告表")
public class SmsHomeAdvertiseController implements IBaseController<SmsHomeAdvertiseService, SmsHomeAdvertise> {

    private final SmsHomeAdvertiseService smsHomeAdvertiseService;

    @Override
    public SmsHomeAdvertiseService getService() {
        return smsHomeAdvertiseService;
    }

}
