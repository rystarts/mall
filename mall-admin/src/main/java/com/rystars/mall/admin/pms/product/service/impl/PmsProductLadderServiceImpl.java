package com.rystars.mall.admin.pms.product.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.pms.product.bean.PmsProductLadder;
import com.rystars.mall.admin.pms.product.mapper.PmsProductLadderMapper;
import com.rystars.mall.admin.pms.product.service.PmsProductLadderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【pms_product_ladder(产品阶梯价格表(只针对同商品))】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:11:31
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class PmsProductLadderServiceImpl extends IBaseServiceImpl<PmsProductLadderMapper, PmsProductLadder> implements PmsProductLadderService {

    private final PmsProductLadderMapper pmsProductLadderMapper;

}




