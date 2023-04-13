package com.rystars.mall.admin.ums.role.controller;

import com.rystars.mall.admin.ums.role.bean.UmsRolePermissionRelation;
import com.rystars.mall.admin.ums.role.service.UmsRolePermissionRelationService;
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
 * 【ums_role_permission_relation(后台用户角色和权限关系表)】Controller
 * @author rystars
 * @date 2023-04-13 10:59:33
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/role/permission/relation")
@Tag(name = "UmsRolePermissionRelationController", description = "后台用户角色和权限关系表")
public class UmsRolePermissionRelationController {

    private final UmsRolePermissionRelationService umsRolePermissionRelationService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<UmsRolePermissionRelation> save(@Parameter(name = "后台用户角色和权限关系表", required = true)
                                                     @RequestBody UmsRolePermissionRelation umsRolePermissionRelation) {
        return Result.instance(umsRolePermissionRelationService.save(umsRolePermissionRelation));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<UmsRolePermissionRelation> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody UmsRolePermissionRelation umsRolePermissionRelation) {
        boolean result = umsRolePermissionRelationService.update(umsRolePermissionRelation, new UpdateWrapper<UmsRolePermissionRelation>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<UmsRolePermissionRelation> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(umsRolePermissionRelationService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<UmsRolePermissionRelation> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(umsRolePermissionRelationService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<UmsRolePermissionRelation>> queryAll() {
        return Result.success(umsRolePermissionRelationService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<UmsRolePermissionRelation>> queryPage(@RequestBody PageParam page) {
        return Result.success(umsRolePermissionRelationService.queryPage(page, null));
    }

}
