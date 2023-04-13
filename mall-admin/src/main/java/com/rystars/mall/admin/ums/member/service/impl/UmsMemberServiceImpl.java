package com.rystars.mall.admin.ums.member.service.impl;

import com.rystars.mall.admin.ums.member.bean.UmsMember;
import com.rystars.mall.admin.ums.member.service.UmsMemberService;
import com.rystars.mall.admin.ums.member.mapper.UmsMemberMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【ums_member(会员表)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:58:51
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UmsMemberServiceImpl extends IBaseServiceImpl<UmsMemberMapper, UmsMember> implements UmsMemberService{

    private final UmsMemberMapper umsMemberMapper;

}




