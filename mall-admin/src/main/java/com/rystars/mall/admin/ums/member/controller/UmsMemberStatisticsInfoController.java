package com.rystars.mall.admin.ums.member.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.ums.member.bean.UmsMemberStatisticsInfo;
import com.rystars.mall.admin.ums.member.service.UmsMemberStatisticsInfoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【ums_member_statistics_info(会员统计信息)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:12:53
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/member/statistics/info")
@Tag(name = "UmsMemberStatisticsInfoController", description = "会员统计信息")
public class UmsMemberStatisticsInfoController implements IBaseController<UmsMemberStatisticsInfoService, UmsMemberStatisticsInfo> {

    private final UmsMemberStatisticsInfoService umsMemberStatisticsInfoService;

    @Override
    public UmsMemberStatisticsInfoService getService() {
        return umsMemberStatisticsInfoService;
    }

}
