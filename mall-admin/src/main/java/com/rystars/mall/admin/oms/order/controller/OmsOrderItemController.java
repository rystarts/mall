package com.rystars.mall.admin.oms.order.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.oms.order.bean.OmsOrderItem;
import com.rystars.mall.admin.oms.order.service.OmsOrderItemService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【oms_order_item(订单中所包含的商品)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:10:38
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/oms/order/item")
@Tag(name = "OmsOrderItemController", description = "订单中所包含的商品")
public class OmsOrderItemController implements IBaseController<OmsOrderItemService, OmsOrderItem> {

    private final OmsOrderItemService omsOrderItemService;

    @Override
    public OmsOrderItemService getService() {
        return omsOrderItemService;
    }

}
