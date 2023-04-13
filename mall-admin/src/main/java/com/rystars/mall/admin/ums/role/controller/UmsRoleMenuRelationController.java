package com.rystars.mall.admin.ums.role.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.ums.role.bean.UmsRoleMenuRelation;
import com.rystars.mall.admin.ums.role.service.UmsRoleMenuRelationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【ums_role_menu_relation(后台角色菜单关系表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:59:33
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/role/menu/relation")
@Tag(name = "UmsRoleMenuRelationController", description = "后台角色菜单关系表")
public class UmsRoleMenuRelationController {

    private final UmsRoleMenuRelationService umsRoleMenuRelationService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<UmsRoleMenuRelation> save(@Parameter(name = "后台角色菜单关系表", required = true)
                                            @RequestBody UmsRoleMenuRelation umsRoleMenuRelation) {
        return Result.instance(umsRoleMenuRelationService.save(umsRoleMenuRelation));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<UmsRoleMenuRelation> update(@Parameter(name = "主键", required = true)
                                              @PathVariable(value = "id") String id,
                                              @RequestBody UmsRoleMenuRelation umsRoleMenuRelation) {
        boolean result = umsRoleMenuRelationService.update(umsRoleMenuRelation, new UpdateWrapper<UmsRoleMenuRelation>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<UmsRoleMenuRelation> delete(@Parameter(name = "主键", required = true)
                                              @PathVariable(value = "id") String id) {
        return Result.instance(umsRoleMenuRelationService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<UmsRoleMenuRelation> queryById(@Parameter(name = "主键", required = true)
                                                 @PathVariable(value = "id") String id) {
        return Result.success(umsRoleMenuRelationService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<UmsRoleMenuRelation>> queryAll() {
        return Result.success(umsRoleMenuRelationService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<UmsRoleMenuRelation>> queryPage(@RequestBody PageParam page) {
        return Result.success(umsRoleMenuRelationService.queryPage(page, null));
    }

}
