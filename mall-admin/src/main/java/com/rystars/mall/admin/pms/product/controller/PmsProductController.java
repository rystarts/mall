package com.rystars.mall.admin.pms.product.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.pms.product.bean.PmsProduct;
import com.rystars.mall.admin.pms.product.service.PmsProductService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【pms_product(商品信息)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:11:31
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/product")
@Tag(name = "PmsProductController", description = "商品信息")
public class PmsProductController implements IBaseController<PmsProductService, PmsProduct> {

    private final PmsProductService pmsProductService;

    @Override
    public PmsProductService getService() {
        return pmsProductService;
    }

}
