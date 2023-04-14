package com.rystars.mall.admin.pms.product.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.pms.product.bean.PmsProductVertifyRecord;
import com.rystars.mall.admin.pms.product.service.PmsProductVertifyRecordService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【pms_product_vertify_record(商品审核记录)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:11:31
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/product/vertify/record")
@Tag(name = "PmsProductVertifyRecordController", description = "商品审核记录")
public class PmsProductVertifyRecordController implements IBaseController<PmsProductVertifyRecordService, PmsProductVertifyRecord> {

    private final PmsProductVertifyRecordService pmsProductVertifyRecordService;

    @Override
    public PmsProductVertifyRecordService getService() {
        return pmsProductVertifyRecordService;
    }

}
