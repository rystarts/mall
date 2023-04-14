package com.rystars.mall.admin.oms.order.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.oms.order.bean.OmsOrderReturnApply;
import com.rystars.mall.admin.oms.order.service.OmsOrderReturnApplyService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【oms_order_return_apply(订单退货申请)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:10:38
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/oms/order/return/apply")
@Tag(name = "OmsOrderReturnApplyController", description = "订单退货申请")
public class OmsOrderReturnApplyController implements IBaseController<OmsOrderReturnApplyService, OmsOrderReturnApply> {

    private final OmsOrderReturnApplyService omsOrderReturnApplyService;

    @Override
    public OmsOrderReturnApplyService getService() {
        return omsOrderReturnApplyService;
    }

}
