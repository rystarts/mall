package com.rystars.mall.admin.pms.product.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.pms.product.bean.PmsProductFullReduction;
import com.rystars.mall.admin.pms.product.service.PmsProductFullReductionService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【pms_product_full_reduction(产品满减表(只针对同商品))】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:11:31
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/product/full/reduction")
@Tag(name = "PmsProductFullReductionController", description = "产品满减表(只针对同商品)")
public class PmsProductFullReductionController implements IBaseController<PmsProductFullReductionService, PmsProductFullReduction> {

    private final PmsProductFullReductionService pmsProductFullReductionService;

    @Override
    public PmsProductFullReductionService getService() {
        return pmsProductFullReductionService;
    }

}
