package com.rystars.mall.admin.ums.role.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.ums.role.bean.UmsRoleResourceRelation;
import com.rystars.mall.admin.ums.role.service.UmsRoleResourceRelationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【ums_role_resource_relation(后台角色资源关系表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:13:33
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/role/resource/relation")
@Tag(name = "UmsRoleResourceRelationController", description = "后台角色资源关系表")
public class UmsRoleResourceRelationController implements IBaseController<UmsRoleResourceRelationService, UmsRoleResourceRelation> {

    private final UmsRoleResourceRelationService umsRoleResourceRelationService;

    @Override
    public UmsRoleResourceRelationService getService() {
        return umsRoleResourceRelationService;
    }

}
