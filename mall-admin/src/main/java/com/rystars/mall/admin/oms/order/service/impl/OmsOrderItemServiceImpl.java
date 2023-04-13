package com.rystars.mall.admin.oms.order.service.impl;

import com.rystars.mall.admin.oms.order.bean.OmsOrderItem;
import com.rystars.mall.admin.oms.order.service.OmsOrderItemService;
import com.rystars.mall.admin.oms.order.mapper.OmsOrderItemMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【oms_order_item(订单中所包含的商品)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:43:38
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class OmsOrderItemServiceImpl extends IBaseServiceImpl<OmsOrderItemMapper, OmsOrderItem> implements OmsOrderItemService{

    private final OmsOrderItemMapper omsOrderItemMapper;

}




