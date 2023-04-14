package com.rystars.mall.admin.ums.integration.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.ums.integration.bean.UmsIntegrationChangeHistory;
import com.rystars.mall.admin.ums.integration.mapper.UmsIntegrationChangeHistoryMapper;
import com.rystars.mall.admin.ums.integration.service.UmsIntegrationChangeHistoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【ums_integration_change_history(积分变化历史记录表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:12:41
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UmsIntegrationChangeHistoryServiceImpl extends IBaseServiceImpl<UmsIntegrationChangeHistoryMapper, UmsIntegrationChangeHistory> implements UmsIntegrationChangeHistoryService {

    private final UmsIntegrationChangeHistoryMapper umsIntegrationChangeHistoryMapper;

}




