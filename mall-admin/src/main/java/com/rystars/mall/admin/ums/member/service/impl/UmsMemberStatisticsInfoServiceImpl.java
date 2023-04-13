package com.rystars.mall.admin.ums.member.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.ums.member.bean.UmsMemberStatisticsInfo;
import com.rystars.mall.admin.ums.member.mapper.UmsMemberStatisticsInfoMapper;
import com.rystars.mall.admin.ums.member.service.UmsMemberStatisticsInfoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【ums_member_statistics_info(会员统计信息)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-13 10:58:51
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UmsMemberStatisticsInfoServiceImpl extends IBaseServiceImpl<UmsMemberStatisticsInfoMapper, UmsMemberStatisticsInfo> implements UmsMemberStatisticsInfoService {

    private final UmsMemberStatisticsInfoMapper umsMemberStatisticsInfoMapper;

}




