package com.rystars.mall.admin.oms.order.service.impl;

import com.rystars.mall.admin.oms.order.bean.OmsOrderOperateHistory;
import com.rystars.mall.admin.oms.order.service.OmsOrderOperateHistoryService;
import com.rystars.mall.admin.oms.order.mapper.OmsOrderOperateHistoryMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【oms_order_operate_history(订单操作历史记录)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:43:38
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class OmsOrderOperateHistoryServiceImpl extends IBaseServiceImpl<OmsOrderOperateHistoryMapper, OmsOrderOperateHistory> implements OmsOrderOperateHistoryService{

    private final OmsOrderOperateHistoryMapper omsOrderOperateHistoryMapper;

}




