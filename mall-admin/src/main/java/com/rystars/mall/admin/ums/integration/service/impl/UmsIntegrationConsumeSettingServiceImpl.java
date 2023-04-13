package com.rystars.mall.admin.ums.integration.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.ums.integration.bean.UmsIntegrationConsumeSetting;
import com.rystars.mall.admin.ums.integration.mapper.UmsIntegrationConsumeSettingMapper;
import com.rystars.mall.admin.ums.integration.service.UmsIntegrationConsumeSettingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【ums_integration_consume_setting(积分消费设置)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-13 10:58:39
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UmsIntegrationConsumeSettingServiceImpl extends IBaseServiceImpl<UmsIntegrationConsumeSettingMapper, UmsIntegrationConsumeSetting> implements UmsIntegrationConsumeSettingService {

    private final UmsIntegrationConsumeSettingMapper umsIntegrationConsumeSettingMapper;

}




