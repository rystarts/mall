package com.rystars.mall.admin.ums.role.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.ums.role.bean.UmsRole;
import com.rystars.mall.admin.ums.role.service.UmsRoleService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【ums_role(后台用户角色表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:13:33
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/role")
@Tag(name = "UmsRoleController", description = "后台用户角色表")
public class UmsRoleController implements IBaseController<UmsRoleService, UmsRole> {

    private final UmsRoleService umsRoleService;

    @Override
    public UmsRoleService getService() {
        return umsRoleService;
    }

}
