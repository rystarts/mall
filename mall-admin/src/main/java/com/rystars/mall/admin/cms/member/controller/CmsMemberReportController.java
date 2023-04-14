package com.rystars.mall.admin.cms.member.controller;

import com.rystars.mall.admin.cms.member.bean.CmsMemberReport;
import com.rystars.mall.admin.cms.member.service.CmsMemberReportService;
import com.rystars.mall.admin.frame.base.controller.IBaseController;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【cms_member_report(用户举报表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:09:40
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cms/member/report")
@Tag(name = "CmsMemberReportController", description = "用户举报表")
public class CmsMemberReportController implements IBaseController<CmsMemberReportService, CmsMemberReport> {

    private final CmsMemberReportService cmsMemberReportService;

    @Override
    public CmsMemberReportService getService() {
        return cmsMemberReportService;
    }

}
