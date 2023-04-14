package com.rystars.mall.admin.ums.admin.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.ums.admin.bean.UmsAdminLoginLog;
import com.rystars.mall.admin.ums.admin.service.UmsAdminLoginLogService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【ums_admin_login_log(后台用户登录日志表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:12:20
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/admin/login/log")
@Tag(name = "UmsAdminLoginLogController", description = "后台用户登录日志表")
public class UmsAdminLoginLogController implements IBaseController<UmsAdminLoginLogService, UmsAdminLoginLog> {

    private final UmsAdminLoginLogService umsAdminLoginLogService;

    @Override
    public UmsAdminLoginLogService getService() {
        return umsAdminLoginLogService;
    }

}
