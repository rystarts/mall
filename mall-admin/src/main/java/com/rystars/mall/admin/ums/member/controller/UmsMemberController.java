package com.rystars.mall.admin.ums.member.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.ums.member.bean.UmsMember;
import com.rystars.mall.admin.ums.member.service.UmsMemberService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【ums_member(会员表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:12:52
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/member")
@Tag(name = "UmsMemberController", description = "会员表")
public class UmsMemberController implements IBaseController<UmsMemberService, UmsMember> {

    private final UmsMemberService umsMemberService;

    @Override
    public UmsMemberService getService() {
        return umsMemberService;
    }

}
