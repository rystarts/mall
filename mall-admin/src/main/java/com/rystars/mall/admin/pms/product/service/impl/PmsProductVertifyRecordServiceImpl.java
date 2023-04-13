package com.rystars.mall.admin.pms.product.service.impl;

import com.rystars.mall.admin.pms.product.bean.PmsProductVertifyRecord;
import com.rystars.mall.admin.pms.product.service.PmsProductVertifyRecordService;
import com.rystars.mall.admin.pms.product.mapper.PmsProductVertifyRecordMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【pms_product_vertify_record(商品审核记录)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:50:57
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class PmsProductVertifyRecordServiceImpl extends IBaseServiceImpl<PmsProductVertifyRecordMapper, PmsProductVertifyRecord> implements PmsProductVertifyRecordService{

    private final PmsProductVertifyRecordMapper pmsProductVertifyRecordMapper;

}




