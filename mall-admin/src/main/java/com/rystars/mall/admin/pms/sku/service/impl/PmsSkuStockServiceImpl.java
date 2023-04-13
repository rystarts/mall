package com.rystars.mall.admin.pms.sku.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.pms.sku.bean.PmsSkuStock;
import com.rystars.mall.admin.pms.sku.mapper.PmsSkuStockMapper;
import com.rystars.mall.admin.pms.sku.service.PmsSkuStockService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【pms_sku_stock(sku的库存)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-13 10:51:06
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class PmsSkuStockServiceImpl extends IBaseServiceImpl<PmsSkuStockMapper, PmsSkuStock> implements PmsSkuStockService {

    private final PmsSkuStockMapper pmsSkuStockMapper;

}




