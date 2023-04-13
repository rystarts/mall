package com.rystars.mall.admin.ums.admin.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.ums.admin.bean.UmsAdminLoginLog;
import com.rystars.mall.admin.ums.admin.service.UmsAdminLoginLogService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【ums_admin_login_log(后台用户登录日志表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:58:12
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/admin/login/log")
@Tag(name = "UmsAdminLoginLogController", description = "后台用户登录日志表")
public class UmsAdminLoginLogController {

    private final UmsAdminLoginLogService umsAdminLoginLogService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<UmsAdminLoginLog> save(@Parameter(name = "后台用户登录日志表", required = true)
                                         @RequestBody UmsAdminLoginLog umsAdminLoginLog) {
        return Result.instance(umsAdminLoginLogService.save(umsAdminLoginLog));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<UmsAdminLoginLog> update(@Parameter(name = "主键", required = true)
                                           @PathVariable(value = "id") String id,
                                           @RequestBody UmsAdminLoginLog umsAdminLoginLog) {
        boolean result = umsAdminLoginLogService.update(umsAdminLoginLog, new UpdateWrapper<UmsAdminLoginLog>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<UmsAdminLoginLog> delete(@Parameter(name = "主键", required = true)
                                           @PathVariable(value = "id") String id) {
        return Result.instance(umsAdminLoginLogService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<UmsAdminLoginLog> queryById(@Parameter(name = "主键", required = true)
                                              @PathVariable(value = "id") String id) {
        return Result.success(umsAdminLoginLogService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<UmsAdminLoginLog>> queryAll() {
        return Result.success(umsAdminLoginLogService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<UmsAdminLoginLog>> queryPage(@RequestBody PageParam page) {
        return Result.success(umsAdminLoginLogService.queryPage(page, null));
    }

}
