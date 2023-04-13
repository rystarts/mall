package com.rystars.mall.admin.ums.admin.service.impl;

import com.rystars.mall.admin.ums.admin.bean.UmsAdminLoginLog;
import com.rystars.mall.admin.ums.admin.service.UmsAdminLoginLogService;
import com.rystars.mall.admin.ums.admin.mapper.UmsAdminLoginLogMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【ums_admin_login_log(后台用户登录日志表)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:58:12
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UmsAdminLoginLogServiceImpl extends IBaseServiceImpl<UmsAdminLoginLogMapper, UmsAdminLoginLog> implements UmsAdminLoginLogService{

    private final UmsAdminLoginLogMapper umsAdminLoginLogMapper;

}




