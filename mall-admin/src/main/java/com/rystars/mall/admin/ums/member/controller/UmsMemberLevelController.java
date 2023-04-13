package com.rystars.mall.admin.ums.member.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.ums.member.bean.UmsMemberLevel;
import com.rystars.mall.admin.ums.member.service.UmsMemberLevelService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【ums_member_level(会员等级表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:58:51
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/member/level")
@Tag(name = "UmsMemberLevelController", description = "会员等级表")
public class UmsMemberLevelController {

    private final UmsMemberLevelService umsMemberLevelService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<UmsMemberLevel> save(@Parameter(name = "会员等级表", required = true)
                                       @RequestBody UmsMemberLevel umsMemberLevel) {
        return Result.instance(umsMemberLevelService.save(umsMemberLevel));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<UmsMemberLevel> update(@Parameter(name = "主键", required = true)
                                         @PathVariable(value = "id") String id,
                                         @RequestBody UmsMemberLevel umsMemberLevel) {
        boolean result = umsMemberLevelService.update(umsMemberLevel, new UpdateWrapper<UmsMemberLevel>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<UmsMemberLevel> delete(@Parameter(name = "主键", required = true)
                                         @PathVariable(value = "id") String id) {
        return Result.instance(umsMemberLevelService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<UmsMemberLevel> queryById(@Parameter(name = "主键", required = true)
                                            @PathVariable(value = "id") String id) {
        return Result.success(umsMemberLevelService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<UmsMemberLevel>> queryAll() {
        return Result.success(umsMemberLevelService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<UmsMemberLevel>> queryPage(@RequestBody PageParam page) {
        return Result.success(umsMemberLevelService.queryPage(page, null));
    }

}
