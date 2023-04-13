package com.rystars.mall.admin.ums.integration.controller;

import com.rystars.mall.admin.ums.integration.bean.UmsIntegrationChangeHistory;
import com.rystars.mall.admin.ums.integration.service.UmsIntegrationChangeHistoryService;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 【ums_integration_change_history(积分变化历史记录表)】Controller
 * @author rystars
 * @date 2023-04-13 10:58:39
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/integration/change/history")
@Tag(name = "UmsIntegrationChangeHistoryController", description = "积分变化历史记录表")
public class UmsIntegrationChangeHistoryController {

    private final UmsIntegrationChangeHistoryService umsIntegrationChangeHistoryService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<UmsIntegrationChangeHistory> save(@Parameter(name = "积分变化历史记录表", required = true)
                                                     @RequestBody UmsIntegrationChangeHistory umsIntegrationChangeHistory) {
        return Result.instance(umsIntegrationChangeHistoryService.save(umsIntegrationChangeHistory));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<UmsIntegrationChangeHistory> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody UmsIntegrationChangeHistory umsIntegrationChangeHistory) {
        boolean result = umsIntegrationChangeHistoryService.update(umsIntegrationChangeHistory, new UpdateWrapper<UmsIntegrationChangeHistory>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<UmsIntegrationChangeHistory> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(umsIntegrationChangeHistoryService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<UmsIntegrationChangeHistory> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(umsIntegrationChangeHistoryService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<UmsIntegrationChangeHistory>> queryAll() {
        return Result.success(umsIntegrationChangeHistoryService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<UmsIntegrationChangeHistory>> queryPage(@RequestBody PageParam page) {
        return Result.success(umsIntegrationChangeHistoryService.queryPage(page, null));
    }

}
