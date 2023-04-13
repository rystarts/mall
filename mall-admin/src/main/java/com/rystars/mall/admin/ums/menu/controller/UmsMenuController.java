package com.rystars.mall.admin.ums.menu.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.ums.menu.bean.UmsMenu;
import com.rystars.mall.admin.ums.menu.service.UmsMenuService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【ums_menu(后台菜单表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:59:04
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/menu")
@Tag(name = "UmsMenuController", description = "后台菜单表")
public class UmsMenuController {

    private final UmsMenuService umsMenuService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<UmsMenu> save(@Parameter(name = "后台菜单表", required = true)
                                @RequestBody UmsMenu umsMenu) {
        return Result.instance(umsMenuService.save(umsMenu));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<UmsMenu> update(@Parameter(name = "主键", required = true)
                                  @PathVariable(value = "id") String id,
                                  @RequestBody UmsMenu umsMenu) {
        boolean result = umsMenuService.update(umsMenu, new UpdateWrapper<UmsMenu>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<UmsMenu> delete(@Parameter(name = "主键", required = true)
                                  @PathVariable(value = "id") String id) {
        return Result.instance(umsMenuService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<UmsMenu> queryById(@Parameter(name = "主键", required = true)
                                     @PathVariable(value = "id") String id) {
        return Result.success(umsMenuService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<UmsMenu>> queryAll() {
        return Result.success(umsMenuService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<UmsMenu>> queryPage(@RequestBody PageParam page) {
        return Result.success(umsMenuService.queryPage(page, null));
    }

}
