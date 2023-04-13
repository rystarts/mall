package com.rystars.mall.admin.oms.cart.service.impl;

import com.rystars.mall.admin.oms.cart.bean.OmsCartItem;
import com.rystars.mall.admin.oms.cart.service.OmsCartItemService;
import com.rystars.mall.admin.oms.cart.mapper.OmsCartItemMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【oms_cart_item(购物车表)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:43:19
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class OmsCartItemServiceImpl extends IBaseServiceImpl<OmsCartItemMapper, OmsCartItem> implements OmsCartItemService{

    private final OmsCartItemMapper omsCartItemMapper;

}




