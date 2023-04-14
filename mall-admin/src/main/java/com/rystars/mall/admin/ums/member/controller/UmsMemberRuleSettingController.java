package com.rystars.mall.admin.ums.member.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.ums.member.bean.UmsMemberRuleSetting;
import com.rystars.mall.admin.ums.member.service.UmsMemberRuleSettingService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【ums_member_rule_setting(会员积分成长规则表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:12:53
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/member/rule/setting")
@Tag(name = "UmsMemberRuleSettingController", description = "会员积分成长规则表")
public class UmsMemberRuleSettingController implements IBaseController<UmsMemberRuleSettingService, UmsMemberRuleSetting> {

    private final UmsMemberRuleSettingService umsMemberRuleSettingService;

    @Override
    public UmsMemberRuleSettingService getService() {
        return umsMemberRuleSettingService;
    }

}
