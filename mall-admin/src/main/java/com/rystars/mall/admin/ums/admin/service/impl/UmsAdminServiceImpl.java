package com.rystars.mall.admin.ums.admin.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.ums.admin.bean.UmsAdmin;
import com.rystars.mall.admin.ums.admin.mapper.UmsAdminMapper;
import com.rystars.mall.admin.ums.admin.service.UmsAdminService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【ums_admin(后台用户表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:12:20
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UmsAdminServiceImpl extends IBaseServiceImpl<UmsAdminMapper, UmsAdmin> implements UmsAdminService {

    private final UmsAdminMapper umsAdminMapper;

}




