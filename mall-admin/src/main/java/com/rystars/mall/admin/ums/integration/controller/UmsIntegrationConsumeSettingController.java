package com.rystars.mall.admin.ums.integration.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.ums.integration.bean.UmsIntegrationConsumeSetting;
import com.rystars.mall.admin.ums.integration.service.UmsIntegrationConsumeSettingService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【ums_integration_consume_setting(积分消费设置)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:12:41
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/integration/consume/setting")
@Tag(name = "UmsIntegrationConsumeSettingController", description = "积分消费设置")
public class UmsIntegrationConsumeSettingController implements IBaseController<UmsIntegrationConsumeSettingService, UmsIntegrationConsumeSetting> {

    private final UmsIntegrationConsumeSettingService umsIntegrationConsumeSettingService;

    @Override
    public UmsIntegrationConsumeSettingService getService() {
        return umsIntegrationConsumeSettingService;
    }

}
