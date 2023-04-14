package com.rystars.mall.admin.ums.member.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.ums.member.bean.UmsMemberMemberTagRelation;
import com.rystars.mall.admin.ums.member.mapper.UmsMemberMemberTagRelationMapper;
import com.rystars.mall.admin.ums.member.service.UmsMemberMemberTagRelationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【ums_member_member_tag_relation(用户和标签关系表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:12:53
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UmsMemberMemberTagRelationServiceImpl extends IBaseServiceImpl<UmsMemberMemberTagRelationMapper, UmsMemberMemberTagRelation> implements UmsMemberMemberTagRelationService {

    private final UmsMemberMemberTagRelationMapper umsMemberMemberTagRelationMapper;

}




