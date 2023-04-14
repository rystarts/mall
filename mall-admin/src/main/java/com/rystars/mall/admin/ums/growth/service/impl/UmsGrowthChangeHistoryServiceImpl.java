package com.rystars.mall.admin.ums.growth.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.ums.growth.bean.UmsGrowthChangeHistory;
import com.rystars.mall.admin.ums.growth.mapper.UmsGrowthChangeHistoryMapper;
import com.rystars.mall.admin.ums.growth.service.UmsGrowthChangeHistoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【ums_growth_change_history(成长值变化历史记录表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:12:27
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UmsGrowthChangeHistoryServiceImpl extends IBaseServiceImpl<UmsGrowthChangeHistoryMapper, UmsGrowthChangeHistory> implements UmsGrowthChangeHistoryService {

    private final UmsGrowthChangeHistoryMapper umsGrowthChangeHistoryMapper;

}




