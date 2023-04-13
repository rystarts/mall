package com.rystars.mall.admin.ums.role.service.impl;

import com.rystars.mall.admin.ums.role.bean.UmsRole;
import com.rystars.mall.admin.ums.role.service.UmsRoleService;
import com.rystars.mall.admin.ums.role.mapper.UmsRoleMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【ums_role(后台用户角色表)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:59:33
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UmsRoleServiceImpl extends IBaseServiceImpl<UmsRoleMapper, UmsRole> implements UmsRoleService{

    private final UmsRoleMapper umsRoleMapper;

}




