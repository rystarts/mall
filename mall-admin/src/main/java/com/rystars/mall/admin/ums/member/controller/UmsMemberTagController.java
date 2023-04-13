package com.rystars.mall.admin.ums.member.controller;

import com.rystars.mall.admin.ums.member.bean.UmsMemberTag;
import com.rystars.mall.admin.ums.member.service.UmsMemberTagService;
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
 * 【ums_member_tag(用户标签表)】Controller
 * @author rystars
 * @date 2023-04-13 10:58:51
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/member/tag")
@Tag(name = "UmsMemberTagController", description = "用户标签表")
public class UmsMemberTagController {

    private final UmsMemberTagService umsMemberTagService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<UmsMemberTag> save(@Parameter(name = "用户标签表", required = true)
                                                     @RequestBody UmsMemberTag umsMemberTag) {
        return Result.instance(umsMemberTagService.save(umsMemberTag));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<UmsMemberTag> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody UmsMemberTag umsMemberTag) {
        boolean result = umsMemberTagService.update(umsMemberTag, new UpdateWrapper<UmsMemberTag>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<UmsMemberTag> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(umsMemberTagService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<UmsMemberTag> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(umsMemberTagService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<UmsMemberTag>> queryAll() {
        return Result.success(umsMemberTagService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<UmsMemberTag>> queryPage(@RequestBody PageParam page) {
        return Result.success(umsMemberTagService.queryPage(page, null));
    }

}
