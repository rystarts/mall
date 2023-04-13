package com.rystars.mall.admin.ums.admin.controller;

import com.rystars.mall.admin.ums.admin.bean.UmsAdminRoleRelation;
import com.rystars.mall.admin.ums.admin.service.UmsAdminRoleRelationService;
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
 * 【ums_admin_role_relation(后台用户和角色关系表)】Controller
 * @author rystars
 * @date 2023-04-13 10:58:12
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/admin/role/relation")
@Tag(name = "UmsAdminRoleRelationController", description = "后台用户和角色关系表")
public class UmsAdminRoleRelationController {

    private final UmsAdminRoleRelationService umsAdminRoleRelationService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<UmsAdminRoleRelation> save(@Parameter(name = "后台用户和角色关系表", required = true)
                                                     @RequestBody UmsAdminRoleRelation umsAdminRoleRelation) {
        return Result.instance(umsAdminRoleRelationService.save(umsAdminRoleRelation));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<UmsAdminRoleRelation> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody UmsAdminRoleRelation umsAdminRoleRelation) {
        boolean result = umsAdminRoleRelationService.update(umsAdminRoleRelation, new UpdateWrapper<UmsAdminRoleRelation>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<UmsAdminRoleRelation> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(umsAdminRoleRelationService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<UmsAdminRoleRelation> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(umsAdminRoleRelationService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<UmsAdminRoleRelation>> queryAll() {
        return Result.success(umsAdminRoleRelationService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<UmsAdminRoleRelation>> queryPage(@RequestBody PageParam page) {
        return Result.success(umsAdminRoleRelationService.queryPage(page, null));
    }

}
