package com.rystars.mall.admin.ums.permission.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.ums.permission.bean.UmsPermission;
import com.rystars.mall.admin.ums.permission.service.UmsPermissionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【ums_permission(后台用户权限表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:59:13
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/permission")
@Tag(name = "UmsPermissionController", description = "后台用户权限表")
public class UmsPermissionController {

    private final UmsPermissionService umsPermissionService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<UmsPermission> save(@Parameter(name = "后台用户权限表", required = true)
                                      @RequestBody UmsPermission umsPermission) {
        return Result.instance(umsPermissionService.save(umsPermission));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<UmsPermission> update(@Parameter(name = "主键", required = true)
                                        @PathVariable(value = "id") String id,
                                        @RequestBody UmsPermission umsPermission) {
        boolean result = umsPermissionService.update(umsPermission, new UpdateWrapper<UmsPermission>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<UmsPermission> delete(@Parameter(name = "主键", required = true)
                                        @PathVariable(value = "id") String id) {
        return Result.instance(umsPermissionService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<UmsPermission> queryById(@Parameter(name = "主键", required = true)
                                           @PathVariable(value = "id") String id) {
        return Result.success(umsPermissionService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<UmsPermission>> queryAll() {
        return Result.success(umsPermissionService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<UmsPermission>> queryPage(@RequestBody PageParam page) {
        return Result.success(umsPermissionService.queryPage(page, null));
    }

}
