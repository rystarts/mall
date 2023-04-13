package com.rystars.mall.admin.ums.member.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.ums.member.bean.UmsMemberRuleSetting;
import com.rystars.mall.admin.ums.member.mapper.UmsMemberRuleSettingMapper;
import com.rystars.mall.admin.ums.member.service.UmsMemberRuleSettingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【ums_member_rule_setting(会员积分成长规则表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-13 10:58:51
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UmsMemberRuleSettingServiceImpl extends IBaseServiceImpl<UmsMemberRuleSettingMapper, UmsMemberRuleSetting> implements UmsMemberRuleSettingService {

    private final UmsMemberRuleSettingMapper umsMemberRuleSettingMapper;

}




