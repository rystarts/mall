package com.rystars.mall.admin.ums.admin.service.impl;

import com.rystars.mall.admin.ums.admin.bean.UmsAdminRoleRelation;
import com.rystars.mall.admin.ums.admin.service.UmsAdminRoleRelationService;
import com.rystars.mall.admin.ums.admin.mapper.UmsAdminRoleRelationMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【ums_admin_role_relation(后台用户和角色关系表)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:58:13
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UmsAdminRoleRelationServiceImpl extends IBaseServiceImpl<UmsAdminRoleRelationMapper, UmsAdminRoleRelation> implements UmsAdminRoleRelationService{

    private final UmsAdminRoleRelationMapper umsAdminRoleRelationMapper;

}




