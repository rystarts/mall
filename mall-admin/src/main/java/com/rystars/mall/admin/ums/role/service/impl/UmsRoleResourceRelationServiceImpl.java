package com.rystars.mall.admin.ums.role.service.impl;

import com.rystars.mall.admin.ums.role.bean.UmsRoleResourceRelation;
import com.rystars.mall.admin.ums.role.service.UmsRoleResourceRelationService;
import com.rystars.mall.admin.ums.role.mapper.UmsRoleResourceRelationMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【ums_role_resource_relation(后台角色资源关系表)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:59:33
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UmsRoleResourceRelationServiceImpl extends IBaseServiceImpl<UmsRoleResourceRelationMapper, UmsRoleResourceRelation> implements UmsRoleResourceRelationService{

    private final UmsRoleResourceRelationMapper umsRoleResourceRelationMapper;

}




