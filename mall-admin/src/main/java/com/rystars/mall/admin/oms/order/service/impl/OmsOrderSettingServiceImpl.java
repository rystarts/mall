package com.rystars.mall.admin.oms.order.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.oms.order.bean.OmsOrderSetting;
import com.rystars.mall.admin.oms.order.mapper.OmsOrderSettingMapper;
import com.rystars.mall.admin.oms.order.service.OmsOrderSettingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【oms_order_setting(订单设置表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:10:38
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class OmsOrderSettingServiceImpl extends IBaseServiceImpl<OmsOrderSettingMapper, OmsOrderSetting> implements OmsOrderSettingService {

    private final OmsOrderSettingMapper omsOrderSettingMapper;

}




