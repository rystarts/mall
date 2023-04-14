package com.rystars.mall.admin.ums.admin.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.ums.admin.bean.UmsAdminPermissionRelation;
import com.rystars.mall.admin.ums.admin.mapper.UmsAdminPermissionRelationMapper;
import com.rystars.mall.admin.ums.admin.service.UmsAdminPermissionRelationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【ums_admin_permission_relation(后台用户和权限关系表(除角色中定义的权限以外的加减权限))】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:12:20
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UmsAdminPermissionRelationServiceImpl extends IBaseServiceImpl<UmsAdminPermissionRelationMapper, UmsAdminPermissionRelation> implements UmsAdminPermissionRelationService {

    private final UmsAdminPermissionRelationMapper umsAdminPermissionRelationMapper;

}




