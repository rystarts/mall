package com.rystars.mall.admin.cms.member.service.impl;

import com.rystars.mall.admin.cms.member.bean.CmsMemberReport;
import com.rystars.mall.admin.cms.member.mapper.CmsMemberReportMapper;
import com.rystars.mall.admin.cms.member.service.CmsMemberReportService;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【cms_member_report(用户举报表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:09:40
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class CmsMemberReportServiceImpl extends IBaseServiceImpl<CmsMemberReportMapper, CmsMemberReport> implements CmsMemberReportService {

    private final CmsMemberReportMapper cmsMemberReportMapper;

}




