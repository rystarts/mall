package com.rystars.mall.admin.oms.order.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.oms.order.bean.OmsOrder;
import com.rystars.mall.admin.oms.order.mapper.OmsOrderMapper;
import com.rystars.mall.admin.oms.order.service.OmsOrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【oms_order(订单表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-13 10:43:37
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class OmsOrderServiceImpl extends IBaseServiceImpl<OmsOrderMapper, OmsOrder> implements OmsOrderService {

    private final OmsOrderMapper omsOrderMapper;

}




