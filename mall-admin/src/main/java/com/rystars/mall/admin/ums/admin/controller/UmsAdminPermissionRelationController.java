package com.rystars.mall.admin.ums.admin.controller;

import com.rystars.mall.admin.ums.admin.bean.UmsAdminPermissionRelation;
import com.rystars.mall.admin.ums.admin.service.UmsAdminPermissionRelationService;
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
 * 【ums_admin_permission_relation(后台用户和权限关系表(除角色中定义的权限以外的加减权限))】Controller
 * @author rystars
 * @date 2023-04-13 10:58:12
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/admin/permission/relation")
@Tag(name = "UmsAdminPermissionRelationController", description = "后台用户和权限关系表(除角色中定义的权限以外的加减权限)")
public class UmsAdminPermissionRelationController {

    private final UmsAdminPermissionRelationService umsAdminPermissionRelationService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<UmsAdminPermissionRelation> save(@Parameter(name = "后台用户和权限关系表(除角色中定义的权限以外的加减权限)", required = true)
                                                     @RequestBody UmsAdminPermissionRelation umsAdminPermissionRelation) {
        return Result.instance(umsAdminPermissionRelationService.save(umsAdminPermissionRelation));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<UmsAdminPermissionRelation> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody UmsAdminPermissionRelation umsAdminPermissionRelation) {
        boolean result = umsAdminPermissionRelationService.update(umsAdminPermissionRelation, new UpdateWrapper<UmsAdminPermissionRelation>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<UmsAdminPermissionRelation> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(umsAdminPermissionRelationService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<UmsAdminPermissionRelation> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(umsAdminPermissionRelationService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<UmsAdminPermissionRelation>> queryAll() {
        return Result.success(umsAdminPermissionRelationService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<UmsAdminPermissionRelation>> queryPage(@RequestBody PageParam page) {
        return Result.success(umsAdminPermissionRelationService.queryPage(page, null));
    }

}
