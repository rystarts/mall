package com.rystars.mall.admin.ums.permission.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.ums.permission.bean.UmsPermission;
import com.rystars.mall.admin.ums.permission.service.UmsPermissionService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【ums_permission(后台用户权限表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:13:14
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/permission")
@Tag(name = "UmsPermissionController", description = "后台用户权限表")
public class UmsPermissionController implements IBaseController<UmsPermissionService, UmsPermission> {

    private final UmsPermissionService umsPermissionService;

    @Override
    public UmsPermissionService getService() {
        return umsPermissionService;
    }

}
