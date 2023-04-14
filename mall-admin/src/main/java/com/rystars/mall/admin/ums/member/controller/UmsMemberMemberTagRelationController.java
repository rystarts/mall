package com.rystars.mall.admin.ums.member.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.ums.member.bean.UmsMemberMemberTagRelation;
import com.rystars.mall.admin.ums.member.service.UmsMemberMemberTagRelationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【ums_member_member_tag_relation(用户和标签关系表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:12:53
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/member/member/tag/relation")
@Tag(name = "UmsMemberMemberTagRelationController", description = "用户和标签关系表")
public class UmsMemberMemberTagRelationController implements IBaseController<UmsMemberMemberTagRelationService, UmsMemberMemberTagRelation> {

    private final UmsMemberMemberTagRelationService umsMemberMemberTagRelationService;

    @Override
    public UmsMemberMemberTagRelationService getService() {
        return umsMemberMemberTagRelationService;
    }

}
