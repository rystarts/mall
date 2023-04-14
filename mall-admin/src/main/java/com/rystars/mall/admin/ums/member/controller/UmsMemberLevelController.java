package com.rystars.mall.admin.ums.member.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.ums.member.bean.UmsMemberLevel;
import com.rystars.mall.admin.ums.member.service.UmsMemberLevelService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【ums_member_level(会员等级表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:12:53
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/member/level")
@Tag(name = "UmsMemberLevelController", description = "会员等级表")
public class UmsMemberLevelController implements IBaseController<UmsMemberLevelService, UmsMemberLevel> {

    private final UmsMemberLevelService umsMemberLevelService;

    @Override
    public UmsMemberLevelService getService() {
        return umsMemberLevelService;
    }

}
