package com.rystars.mall.admin.pms.product.service.impl;

import com.rystars.mall.admin.pms.product.bean.PmsProduct;
import com.rystars.mall.admin.pms.product.service.PmsProductService;
import com.rystars.mall.admin.pms.product.mapper.PmsProductMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【pms_product(商品信息)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:50:56
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class PmsProductServiceImpl extends IBaseServiceImpl<PmsProductMapper, PmsProduct> implements PmsProductService{

    private final PmsProductMapper pmsProductMapper;

}




