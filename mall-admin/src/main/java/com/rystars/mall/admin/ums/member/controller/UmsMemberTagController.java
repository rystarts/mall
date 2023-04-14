package com.rystars.mall.admin.ums.member.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.ums.member.bean.UmsMemberTag;
import com.rystars.mall.admin.ums.member.service.UmsMemberTagService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【ums_member_tag(用户标签表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:12:53
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/member/tag")
@Tag(name = "UmsMemberTagController", description = "用户标签表")
public class UmsMemberTagController implements IBaseController<UmsMemberTagService, UmsMemberTag> {

    private final UmsMemberTagService umsMemberTagService;

    @Override
    public UmsMemberTagService getService() {
        return umsMemberTagService;
    }

}
