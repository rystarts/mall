package com.rystars.mall.admin.pms.product.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.pms.product.bean.PmsProductOperateLog;
import com.rystars.mall.admin.pms.product.service.PmsProductOperateLogService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【pms_product_operate_log】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:11:31
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/product/operate/log")
@Tag(name = "PmsProductOperateLogController", description = "pms_product_operate_log")
public class PmsProductOperateLogController implements IBaseController<PmsProductOperateLogService, PmsProductOperateLog> {

    private final PmsProductOperateLogService pmsProductOperateLogService;

    @Override
    public PmsProductOperateLogService getService() {
        return pmsProductOperateLogService;
    }

}
