package com.rystars.mall.admin.ums.member.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.ums.member.bean.UmsMemberTag;
import com.rystars.mall.admin.ums.member.mapper.UmsMemberTagMapper;
import com.rystars.mall.admin.ums.member.service.UmsMemberTagService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【ums_member_tag(用户标签表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:12:53
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UmsMemberTagServiceImpl extends IBaseServiceImpl<UmsMemberTagMapper, UmsMemberTag> implements UmsMemberTagService {

    private final UmsMemberTagMapper umsMemberTagMapper;

}




