package com.rystars.mall.admin.ums.member.service.impl;

import com.rystars.mall.admin.ums.member.bean.UmsMemberTask;
import com.rystars.mall.admin.ums.member.service.UmsMemberTaskService;
import com.rystars.mall.admin.ums.member.mapper.UmsMemberTaskMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【ums_member_task(会员任务表)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:58:52
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UmsMemberTaskServiceImpl extends IBaseServiceImpl<UmsMemberTaskMapper, UmsMemberTask> implements UmsMemberTaskService{

    private final UmsMemberTaskMapper umsMemberTaskMapper;

}




