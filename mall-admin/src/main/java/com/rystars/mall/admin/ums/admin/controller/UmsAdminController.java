package com.rystars.mall.admin.ums.admin.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.ums.admin.bean.UmsAdmin;
import com.rystars.mall.admin.ums.admin.service.UmsAdminService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【ums_admin(后台用户表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:58:12
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/admin")
@Tag(name = "UmsAdminController", description = "后台用户表")
public class UmsAdminController {

    private final UmsAdminService umsAdminService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<UmsAdmin> save(@Parameter(name = "后台用户表", required = true)
                                 @RequestBody UmsAdmin umsAdmin) {
        return Result.instance(umsAdminService.save(umsAdmin));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<UmsAdmin> update(@Parameter(name = "主键", required = true)
                                   @PathVariable(value = "id") String id,
                                   @RequestBody UmsAdmin umsAdmin) {
        boolean result = umsAdminService.update(umsAdmin, new UpdateWrapper<UmsAdmin>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<UmsAdmin> delete(@Parameter(name = "主键", required = true)
                                   @PathVariable(value = "id") String id) {
        return Result.instance(umsAdminService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<UmsAdmin> queryById(@Parameter(name = "主键", required = true)
                                      @PathVariable(value = "id") String id) {
        return Result.success(umsAdminService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<UmsAdmin>> queryAll() {
        return Result.success(umsAdminService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<UmsAdmin>> queryPage(@RequestBody PageParam page) {
        return Result.success(umsAdminService.queryPage(page, null));
    }

}
