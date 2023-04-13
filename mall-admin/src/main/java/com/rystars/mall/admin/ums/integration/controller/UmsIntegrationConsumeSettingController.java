package com.rystars.mall.admin.ums.integration.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.ums.integration.bean.UmsIntegrationConsumeSetting;
import com.rystars.mall.admin.ums.integration.service.UmsIntegrationConsumeSettingService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【ums_integration_consume_setting(积分消费设置)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:58:39
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/integration/consume/setting")
@Tag(name = "UmsIntegrationConsumeSettingController", description = "积分消费设置")
public class UmsIntegrationConsumeSettingController {

    private final UmsIntegrationConsumeSettingService umsIntegrationConsumeSettingService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<UmsIntegrationConsumeSetting> save(@Parameter(name = "积分消费设置", required = true)
                                                     @RequestBody UmsIntegrationConsumeSetting umsIntegrationConsumeSetting) {
        return Result.instance(umsIntegrationConsumeSettingService.save(umsIntegrationConsumeSetting));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<UmsIntegrationConsumeSetting> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody UmsIntegrationConsumeSetting umsIntegrationConsumeSetting) {
        boolean result = umsIntegrationConsumeSettingService.update(umsIntegrationConsumeSetting, new UpdateWrapper<UmsIntegrationConsumeSetting>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<UmsIntegrationConsumeSetting> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(umsIntegrationConsumeSettingService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<UmsIntegrationConsumeSetting> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(umsIntegrationConsumeSettingService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<UmsIntegrationConsumeSetting>> queryAll() {
        return Result.success(umsIntegrationConsumeSettingService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<UmsIntegrationConsumeSetting>> queryPage(@RequestBody PageParam page) {
        return Result.success(umsIntegrationConsumeSettingService.queryPage(page, null));
    }

}
