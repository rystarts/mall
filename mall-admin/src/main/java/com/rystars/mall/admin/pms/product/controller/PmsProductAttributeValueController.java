package com.rystars.mall.admin.pms.product.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.pms.product.bean.PmsProductAttributeValue;
import com.rystars.mall.admin.pms.product.service.PmsProductAttributeValueService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【pms_product_attribute_value(存储产品参数信息的表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:11:31
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/product/attribute/value")
@Tag(name = "PmsProductAttributeValueController", description = "存储产品参数信息的表")
public class PmsProductAttributeValueController implements IBaseController<PmsProductAttributeValueService, PmsProductAttributeValue> {

    private final PmsProductAttributeValueService pmsProductAttributeValueService;

    @Override
    public PmsProductAttributeValueService getService() {
        return pmsProductAttributeValueService;
    }

}
