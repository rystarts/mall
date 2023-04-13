package com.rystars.mall.admin.ums.member.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.ums.member.bean.UmsMemberLoginLog;
import com.rystars.mall.admin.ums.member.mapper.UmsMemberLoginLogMapper;
import com.rystars.mall.admin.ums.member.service.UmsMemberLoginLogService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【ums_member_login_log(会员登录记录)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-13 10:58:51
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UmsMemberLoginLogServiceImpl extends IBaseServiceImpl<UmsMemberLoginLogMapper, UmsMemberLoginLog> implements UmsMemberLoginLogService {

    private final UmsMemberLoginLogMapper umsMemberLoginLogMapper;

}




