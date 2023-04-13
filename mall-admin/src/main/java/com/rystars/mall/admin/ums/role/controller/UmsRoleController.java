package com.rystars.mall.admin.ums.role.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.ums.role.bean.UmsRole;
import com.rystars.mall.admin.ums.role.service.UmsRoleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【ums_role(后台用户角色表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:59:33
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/role")
@Tag(name = "UmsRoleController", description = "后台用户角色表")
public class UmsRoleController {

    private final UmsRoleService umsRoleService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<UmsRole> save(@Parameter(name = "后台用户角色表", required = true)
                                @RequestBody UmsRole umsRole) {
        return Result.instance(umsRoleService.save(umsRole));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<UmsRole> update(@Parameter(name = "主键", required = true)
                                  @PathVariable(value = "id") String id,
                                  @RequestBody UmsRole umsRole) {
        boolean result = umsRoleService.update(umsRole, new UpdateWrapper<UmsRole>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<UmsRole> delete(@Parameter(name = "主键", required = true)
                                  @PathVariable(value = "id") String id) {
        return Result.instance(umsRoleService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<UmsRole> queryById(@Parameter(name = "主键", required = true)
                                     @PathVariable(value = "id") String id) {
        return Result.success(umsRoleService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<UmsRole>> queryAll() {
        return Result.success(umsRoleService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<UmsRole>> queryPage(@RequestBody PageParam page) {
        return Result.success(umsRoleService.queryPage(page, null));
    }

}
