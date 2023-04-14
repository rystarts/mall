package com.rystars.mall.admin.oms.order.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.oms.order.bean.OmsOrderReturnReason;
import com.rystars.mall.admin.oms.order.service.OmsOrderReturnReasonService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【oms_order_return_reason(退货原因表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:10:38
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/oms/order/return/reason")
@Tag(name = "OmsOrderReturnReasonController", description = "退货原因表")
public class OmsOrderReturnReasonController implements IBaseController<OmsOrderReturnReasonService, OmsOrderReturnReason> {

    private final OmsOrderReturnReasonService omsOrderReturnReasonService;

    @Override
    public OmsOrderReturnReasonService getService() {
        return omsOrderReturnReasonService;
    }

}
