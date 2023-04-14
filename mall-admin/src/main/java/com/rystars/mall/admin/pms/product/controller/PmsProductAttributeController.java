package com.rystars.mall.admin.pms.product.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.pms.product.bean.PmsProductAttribute;
import com.rystars.mall.admin.pms.product.service.PmsProductAttributeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【pms_product_attribute(商品属性参数表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:11:31
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/product/attribute")
@Tag(name = "PmsProductAttributeController", description = "商品属性参数表")
public class PmsProductAttributeController implements IBaseController<PmsProductAttributeService, PmsProductAttribute> {

    private final PmsProductAttributeService pmsProductAttributeService;

    @Override
    public PmsProductAttributeService getService() {
        return pmsProductAttributeService;
    }

}
