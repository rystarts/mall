package com.rystars.mall.admin.ums.permission.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.ums.permission.bean.UmsPermission;
import com.rystars.mall.admin.ums.permission.mapper.UmsPermissionMapper;
import com.rystars.mall.admin.ums.permission.service.UmsPermissionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【ums_permission(后台用户权限表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:13:14
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UmsPermissionServiceImpl extends IBaseServiceImpl<UmsPermissionMapper, UmsPermission> implements UmsPermissionService {

    private final UmsPermissionMapper umsPermissionMapper;

}




