package com.rystars.mall.admin.pms.sku.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.pms.sku.bean.PmsSkuStock;
import com.rystars.mall.admin.pms.sku.service.PmsSkuStockService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【pms_sku_stock(sku的库存)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:11:38
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/sku/stock")
@Tag(name = "PmsSkuStockController", description = "sku的库存")
public class PmsSkuStockController implements IBaseController<PmsSkuStockService, PmsSkuStock> {

    private final PmsSkuStockService pmsSkuStockService;

    @Override
    public PmsSkuStockService getService() {
        return pmsSkuStockService;
    }

}
