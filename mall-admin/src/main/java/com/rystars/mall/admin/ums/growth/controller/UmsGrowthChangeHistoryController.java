package com.rystars.mall.admin.ums.growth.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.ums.growth.bean.UmsGrowthChangeHistory;
import com.rystars.mall.admin.ums.growth.service.UmsGrowthChangeHistoryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【ums_growth_change_history(成长值变化历史记录表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:12:27
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/growth/change/history")
@Tag(name = "UmsGrowthChangeHistoryController", description = "成长值变化历史记录表")
public class UmsGrowthChangeHistoryController implements IBaseController<UmsGrowthChangeHistoryService, UmsGrowthChangeHistory> {

    private final UmsGrowthChangeHistoryService umsGrowthChangeHistoryService;

    @Override
    public UmsGrowthChangeHistoryService getService() {
        return umsGrowthChangeHistoryService;
    }

}
