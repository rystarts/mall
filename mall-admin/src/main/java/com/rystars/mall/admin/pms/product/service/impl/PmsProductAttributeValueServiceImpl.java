package com.rystars.mall.admin.pms.product.service.impl;

import com.rystars.mall.admin.pms.product.bean.PmsProductAttributeValue;
import com.rystars.mall.admin.pms.product.service.PmsProductAttributeValueService;
import com.rystars.mall.admin.pms.product.mapper.PmsProductAttributeValueMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【pms_product_attribute_value(存储产品参数信息的表)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:50:56
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class PmsProductAttributeValueServiceImpl extends IBaseServiceImpl<PmsProductAttributeValueMapper, PmsProductAttributeValue> implements PmsProductAttributeValueService{

    private final PmsProductAttributeValueMapper pmsProductAttributeValueMapper;

}




