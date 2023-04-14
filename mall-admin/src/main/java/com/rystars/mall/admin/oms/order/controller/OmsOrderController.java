package com.rystars.mall.admin.oms.order.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.oms.order.bean.OmsOrder;
import com.rystars.mall.admin.oms.order.service.OmsOrderService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【oms_order(订单表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:10:38
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/oms/order")
@Tag(name = "OmsOrderController", description = "订单表")
public class OmsOrderController implements IBaseController<OmsOrderService, OmsOrder> {

    private final OmsOrderService omsOrderService;

    @Override
    public OmsOrderService getService() {
        return omsOrderService;
    }

}
