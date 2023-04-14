package com.rystars.mall.admin.ums.integration.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.ums.integration.bean.UmsIntegrationChangeHistory;
import com.rystars.mall.admin.ums.integration.service.UmsIntegrationChangeHistoryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【ums_integration_change_history(积分变化历史记录表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:12:41
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/integration/change/history")
@Tag(name = "UmsIntegrationChangeHistoryController", description = "积分变化历史记录表")
public class UmsIntegrationChangeHistoryController implements IBaseController<UmsIntegrationChangeHistoryService, UmsIntegrationChangeHistory> {

    private final UmsIntegrationChangeHistoryService umsIntegrationChangeHistoryService;

    @Override
    public UmsIntegrationChangeHistoryService getService() {
        return umsIntegrationChangeHistoryService;
    }

}
