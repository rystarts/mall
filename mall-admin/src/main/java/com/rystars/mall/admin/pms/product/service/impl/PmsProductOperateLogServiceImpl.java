package com.rystars.mall.admin.pms.product.service.impl;

import com.rystars.mall.admin.pms.product.bean.PmsProductOperateLog;
import com.rystars.mall.admin.pms.product.service.PmsProductOperateLogService;
import com.rystars.mall.admin.pms.product.mapper.PmsProductOperateLogMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【pms_product_operate_log】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:50:57
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class PmsProductOperateLogServiceImpl extends IBaseServiceImpl<PmsProductOperateLogMapper, PmsProductOperateLog> implements PmsProductOperateLogService{

    private final PmsProductOperateLogMapper pmsProductOperateLogMapper;

}




