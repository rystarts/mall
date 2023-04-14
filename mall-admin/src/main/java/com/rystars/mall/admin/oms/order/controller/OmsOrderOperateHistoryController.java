package com.rystars.mall.admin.oms.order.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.oms.order.bean.OmsOrderOperateHistory;
import com.rystars.mall.admin.oms.order.service.OmsOrderOperateHistoryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【oms_order_operate_history(订单操作历史记录)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:10:38
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/oms/order/operate/history")
@Tag(name = "OmsOrderOperateHistoryController", description = "订单操作历史记录")
public class OmsOrderOperateHistoryController implements IBaseController<OmsOrderOperateHistoryService, OmsOrderOperateHistory> {

    private final OmsOrderOperateHistoryService omsOrderOperateHistoryService;

    @Override
    public OmsOrderOperateHistoryService getService() {
        return omsOrderOperateHistoryService;
    }

}
