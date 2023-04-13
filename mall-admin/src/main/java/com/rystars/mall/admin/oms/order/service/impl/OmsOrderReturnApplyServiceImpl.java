package com.rystars.mall.admin.oms.order.service.impl;

import com.rystars.mall.admin.oms.order.bean.OmsOrderReturnApply;
import com.rystars.mall.admin.oms.order.service.OmsOrderReturnApplyService;
import com.rystars.mall.admin.oms.order.mapper.OmsOrderReturnApplyMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【oms_order_return_apply(订单退货申请)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:43:38
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class OmsOrderReturnApplyServiceImpl extends IBaseServiceImpl<OmsOrderReturnApplyMapper, OmsOrderReturnApply> implements OmsOrderReturnApplyService{

    private final OmsOrderReturnApplyMapper omsOrderReturnApplyMapper;

}




