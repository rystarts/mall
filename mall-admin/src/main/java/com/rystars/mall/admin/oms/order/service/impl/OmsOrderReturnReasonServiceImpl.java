package com.rystars.mall.admin.oms.order.service.impl;

import com.rystars.mall.admin.oms.order.bean.OmsOrderReturnReason;
import com.rystars.mall.admin.oms.order.service.OmsOrderReturnReasonService;
import com.rystars.mall.admin.oms.order.mapper.OmsOrderReturnReasonMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【oms_order_return_reason(退货原因表)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:43:38
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class OmsOrderReturnReasonServiceImpl extends IBaseServiceImpl<OmsOrderReturnReasonMapper, OmsOrderReturnReason> implements OmsOrderReturnReasonService{

    private final OmsOrderReturnReasonMapper omsOrderReturnReasonMapper;

}




