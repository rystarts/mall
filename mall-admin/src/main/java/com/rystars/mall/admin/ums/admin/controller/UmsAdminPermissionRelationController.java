package com.rystars.mall.admin.ums.admin.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.ums.admin.bean.UmsAdminPermissionRelation;
import com.rystars.mall.admin.ums.admin.service.UmsAdminPermissionRelationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【ums_admin_permission_relation(后台用户和权限关系表(除角色中定义的权限以外的加减权限))】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:12:20
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/admin/permission/relation")
@Tag(name = "UmsAdminPermissionRelationController", description = "后台用户和权限关系表(除角色中定义的权限以外的加减权限)")
public class UmsAdminPermissionRelationController implements IBaseController<UmsAdminPermissionRelationService, UmsAdminPermissionRelation> {

    private final UmsAdminPermissionRelationService umsAdminPermissionRelationService;

    @Override
    public UmsAdminPermissionRelationService getService() {
        return umsAdminPermissionRelationService;
    }

}
