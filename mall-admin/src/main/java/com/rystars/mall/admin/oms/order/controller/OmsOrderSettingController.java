package com.rystars.mall.admin.oms.order.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.oms.order.bean.OmsOrderSetting;
import com.rystars.mall.admin.oms.order.service.OmsOrderSettingService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【oms_order_setting(订单设置表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:10:38
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/oms/order/setting")
@Tag(name = "OmsOrderSettingController", description = "订单设置表")
public class OmsOrderSettingController implements IBaseController<OmsOrderSettingService, OmsOrderSetting> {

    private final OmsOrderSettingService omsOrderSettingService;

    @Override
    public OmsOrderSettingService getService() {
        return omsOrderSettingService;
    }

}
