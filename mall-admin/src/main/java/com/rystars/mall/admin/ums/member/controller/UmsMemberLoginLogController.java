package com.rystars.mall.admin.ums.member.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.ums.member.bean.UmsMemberLoginLog;
import com.rystars.mall.admin.ums.member.service.UmsMemberLoginLogService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【ums_member_login_log(会员登录记录)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:12:53
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/member/login/log")
@Tag(name = "UmsMemberLoginLogController", description = "会员登录记录")
public class UmsMemberLoginLogController implements IBaseController<UmsMemberLoginLogService, UmsMemberLoginLog> {

    private final UmsMemberLoginLogService umsMemberLoginLogService;

    @Override
    public UmsMemberLoginLogService getService() {
        return umsMemberLoginLogService;
    }

}
