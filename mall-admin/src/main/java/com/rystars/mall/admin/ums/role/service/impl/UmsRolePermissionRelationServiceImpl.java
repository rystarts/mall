package com.rystars.mall.admin.ums.role.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.ums.role.bean.UmsRolePermissionRelation;
import com.rystars.mall.admin.ums.role.mapper.UmsRolePermissionRelationMapper;
import com.rystars.mall.admin.ums.role.service.UmsRolePermissionRelationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【ums_role_permission_relation(后台用户角色和权限关系表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-13 10:59:33
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UmsRolePermissionRelationServiceImpl extends IBaseServiceImpl<UmsRolePermissionRelationMapper, UmsRolePermissionRelation> implements UmsRolePermissionRelationService {

    private final UmsRolePermissionRelationMapper umsRolePermissionRelationMapper;

}




