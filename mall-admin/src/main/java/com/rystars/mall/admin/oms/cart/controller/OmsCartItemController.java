package com.rystars.mall.admin.oms.cart.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.oms.cart.bean.OmsCartItem;
import com.rystars.mall.admin.oms.cart.service.OmsCartItemService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【oms_cart_item(购物车表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:10:21
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/oms/cart/item")
@Tag(name = "OmsCartItemController", description = "购物车表")
public class OmsCartItemController implements IBaseController<OmsCartItemService, OmsCartItem> {

    private final OmsCartItemService omsCartItemService;

    @Override
    public OmsCartItemService getService() {
        return omsCartItemService;
    }

}
