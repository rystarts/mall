package com.rystars.mall.admin.ums.role.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.ums.role.bean.UmsRoleMenuRelation;
import com.rystars.mall.admin.ums.role.mapper.UmsRoleMenuRelationMapper;
import com.rystars.mall.admin.ums.role.service.UmsRoleMenuRelationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【ums_role_menu_relation(后台角色菜单关系表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:13:33
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UmsRoleMenuRelationServiceImpl extends IBaseServiceImpl<UmsRoleMenuRelationMapper, UmsRoleMenuRelation> implements UmsRoleMenuRelationService {

    private final UmsRoleMenuRelationMapper umsRoleMenuRelationMapper;

}




