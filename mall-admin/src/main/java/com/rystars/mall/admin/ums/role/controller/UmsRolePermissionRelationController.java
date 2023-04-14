package com.rystars.mall.admin.ums.role.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.ums.role.bean.UmsRolePermissionRelation;
import com.rystars.mall.admin.ums.role.service.UmsRolePermissionRelationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【ums_role_permission_relation(后台用户角色和权限关系表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:13:33
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/role/permission/relation")
@Tag(name = "UmsRolePermissionRelationController", description = "后台用户角色和权限关系表")
public class UmsRolePermissionRelationController implements IBaseController<UmsRolePermissionRelationService, UmsRolePermissionRelation> {

    private final UmsRolePermissionRelationService umsRolePermissionRelationService;

    @Override
    public UmsRolePermissionRelationService getService() {
        return umsRolePermissionRelationService;
    }

}
