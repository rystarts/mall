package com.rystars.mall.admin.ums.role.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.ums.role.bean.UmsRoleMenuRelation;
import com.rystars.mall.admin.ums.role.service.UmsRoleMenuRelationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【ums_role_menu_relation(后台角色菜单关系表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:13:33
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/role/menu/relation")
@Tag(name = "UmsRoleMenuRelationController", description = "后台角色菜单关系表")
public class UmsRoleMenuRelationController implements IBaseController<UmsRoleMenuRelationService, UmsRoleMenuRelation> {

    private final UmsRoleMenuRelationService umsRoleMenuRelationService;

    @Override
    public UmsRoleMenuRelationService getService() {
        return umsRoleMenuRelationService;
    }

}
