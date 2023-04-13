package com.rystars.mall.admin.ums.growth.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.ums.growth.bean.UmsGrowthChangeHistory;
import com.rystars.mall.admin.ums.growth.service.UmsGrowthChangeHistoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【ums_growth_change_history(成长值变化历史记录表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:58:25
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/growth/change/history")
@Tag(name = "UmsGrowthChangeHistoryController", description = "成长值变化历史记录表")
public class UmsGrowthChangeHistoryController {

    private final UmsGrowthChangeHistoryService umsGrowthChangeHistoryService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<UmsGrowthChangeHistory> save(@Parameter(name = "成长值变化历史记录表", required = true)
                                               @RequestBody UmsGrowthChangeHistory umsGrowthChangeHistory) {
        return Result.instance(umsGrowthChangeHistoryService.save(umsGrowthChangeHistory));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<UmsGrowthChangeHistory> update(@Parameter(name = "主键", required = true)
                                                 @PathVariable(value = "id") String id,
                                                 @RequestBody UmsGrowthChangeHistory umsGrowthChangeHistory) {
        boolean result = umsGrowthChangeHistoryService.update(umsGrowthChangeHistory, new UpdateWrapper<UmsGrowthChangeHistory>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<UmsGrowthChangeHistory> delete(@Parameter(name = "主键", required = true)
                                                 @PathVariable(value = "id") String id) {
        return Result.instance(umsGrowthChangeHistoryService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<UmsGrowthChangeHistory> queryById(@Parameter(name = "主键", required = true)
                                                    @PathVariable(value = "id") String id) {
        return Result.success(umsGrowthChangeHistoryService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<UmsGrowthChangeHistory>> queryAll() {
        return Result.success(umsGrowthChangeHistoryService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<UmsGrowthChangeHistory>> queryPage(@RequestBody PageParam page) {
        return Result.success(umsGrowthChangeHistoryService.queryPage(page, null));
    }

}
