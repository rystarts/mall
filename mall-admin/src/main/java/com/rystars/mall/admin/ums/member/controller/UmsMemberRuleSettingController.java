package com.rystars.mall.admin.ums.member.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.ums.member.bean.UmsMemberRuleSetting;
import com.rystars.mall.admin.ums.member.service.UmsMemberRuleSettingService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【ums_member_rule_setting(会员积分成长规则表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:58:51
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/member/rule/setting")
@Tag(name = "UmsMemberRuleSettingController", description = "会员积分成长规则表")
public class UmsMemberRuleSettingController {

    private final UmsMemberRuleSettingService umsMemberRuleSettingService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<UmsMemberRuleSetting> save(@Parameter(name = "会员积分成长规则表", required = true)
                                             @RequestBody UmsMemberRuleSetting umsMemberRuleSetting) {
        return Result.instance(umsMemberRuleSettingService.save(umsMemberRuleSetting));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<UmsMemberRuleSetting> update(@Parameter(name = "主键", required = true)
                                               @PathVariable(value = "id") String id,
                                               @RequestBody UmsMemberRuleSetting umsMemberRuleSetting) {
        boolean result = umsMemberRuleSettingService.update(umsMemberRuleSetting, new UpdateWrapper<UmsMemberRuleSetting>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<UmsMemberRuleSetting> delete(@Parameter(name = "主键", required = true)
                                               @PathVariable(value = "id") String id) {
        return Result.instance(umsMemberRuleSettingService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<UmsMemberRuleSetting> queryById(@Parameter(name = "主键", required = true)
                                                  @PathVariable(value = "id") String id) {
        return Result.success(umsMemberRuleSettingService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<UmsMemberRuleSetting>> queryAll() {
        return Result.success(umsMemberRuleSettingService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<UmsMemberRuleSetting>> queryPage(@RequestBody PageParam page) {
        return Result.success(umsMemberRuleSettingService.queryPage(page, null));
    }

}
