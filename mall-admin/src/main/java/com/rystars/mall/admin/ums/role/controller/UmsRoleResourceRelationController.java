package com.rystars.mall.admin.ums.role.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.ums.role.bean.UmsRoleResourceRelation;
import com.rystars.mall.admin.ums.role.service.UmsRoleResourceRelationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【ums_role_resource_relation(后台角色资源关系表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:59:33
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/role/resource/relation")
@Tag(name = "UmsRoleResourceRelationController", description = "后台角色资源关系表")
public class UmsRoleResourceRelationController {

    private final UmsRoleResourceRelationService umsRoleResourceRelationService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<UmsRoleResourceRelation> save(@Parameter(name = "后台角色资源关系表", required = true)
                                                @RequestBody UmsRoleResourceRelation umsRoleResourceRelation) {
        return Result.instance(umsRoleResourceRelationService.save(umsRoleResourceRelation));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<UmsRoleResourceRelation> update(@Parameter(name = "主键", required = true)
                                                  @PathVariable(value = "id") String id,
                                                  @RequestBody UmsRoleResourceRelation umsRoleResourceRelation) {
        boolean result = umsRoleResourceRelationService.update(umsRoleResourceRelation, new UpdateWrapper<UmsRoleResourceRelation>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<UmsRoleResourceRelation> delete(@Parameter(name = "主键", required = true)
                                                  @PathVariable(value = "id") String id) {
        return Result.instance(umsRoleResourceRelationService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<UmsRoleResourceRelation> queryById(@Parameter(name = "主键", required = true)
                                                     @PathVariable(value = "id") String id) {
        return Result.success(umsRoleResourceRelationService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<UmsRoleResourceRelation>> queryAll() {
        return Result.success(umsRoleResourceRelationService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<UmsRoleResourceRelation>> queryPage(@RequestBody PageParam page) {
        return Result.success(umsRoleResourceRelationService.queryPage(page, null));
    }

}
