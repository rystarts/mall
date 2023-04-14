package com.rystars.mall.admin.ums.admin.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.ums.admin.bean.UmsAdminRoleRelation;
import com.rystars.mall.admin.ums.admin.service.UmsAdminRoleRelationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【ums_admin_role_relation(后台用户和角色关系表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:12:20
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/admin/role/relation")
@Tag(name = "UmsAdminRoleRelationController", description = "后台用户和角色关系表")
public class UmsAdminRoleRelationController implements IBaseController<UmsAdminRoleRelationService, UmsAdminRoleRelation> {

    private final UmsAdminRoleRelationService umsAdminRoleRelationService;

    @Override
    public UmsAdminRoleRelationService getService() {
        return umsAdminRoleRelationService;
    }

}
