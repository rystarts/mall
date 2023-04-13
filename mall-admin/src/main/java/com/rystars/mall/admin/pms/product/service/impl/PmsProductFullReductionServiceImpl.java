package com.rystars.mall.admin.pms.product.service.impl;

import com.rystars.mall.admin.pms.product.bean.PmsProductFullReduction;
import com.rystars.mall.admin.pms.product.service.PmsProductFullReductionService;
import com.rystars.mall.admin.pms.product.mapper.PmsProductFullReductionMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【pms_product_full_reduction(产品满减表(只针对同商品))】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:50:57
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class PmsProductFullReductionServiceImpl extends IBaseServiceImpl<PmsProductFullReductionMapper, PmsProductFullReduction> implements PmsProductFullReductionService{

    private final PmsProductFullReductionMapper pmsProductFullReductionMapper;

}




