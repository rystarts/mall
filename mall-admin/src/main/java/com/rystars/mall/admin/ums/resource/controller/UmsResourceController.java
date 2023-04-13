package com.rystars.mall.admin.ums.resource.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.ums.resource.bean.UmsResource;
import com.rystars.mall.admin.ums.resource.service.UmsResourceService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【ums_resource(后台资源表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:59:24
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/resource")
@Tag(name = "UmsResourceController", description = "后台资源表")
public class UmsResourceController {

    private final UmsResourceService umsResourceService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<UmsResource> save(@Parameter(name = "后台资源表", required = true)
                                    @RequestBody UmsResource umsResource) {
        return Result.instance(umsResourceService.save(umsResource));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<UmsResource> update(@Parameter(name = "主键", required = true)
                                      @PathVariable(value = "id") String id,
                                      @RequestBody UmsResource umsResource) {
        boolean result = umsResourceService.update(umsResource, new UpdateWrapper<UmsResource>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<UmsResource> delete(@Parameter(name = "主键", required = true)
                                      @PathVariable(value = "id") String id) {
        return Result.instance(umsResourceService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<UmsResource> queryById(@Parameter(name = "主键", required = true)
                                         @PathVariable(value = "id") String id) {
        return Result.success(umsResourceService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<UmsResource>> queryAll() {
        return Result.success(umsResourceService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<UmsResource>> queryPage(@RequestBody PageParam page) {
        return Result.success(umsResourceService.queryPage(page, null));
    }

}
