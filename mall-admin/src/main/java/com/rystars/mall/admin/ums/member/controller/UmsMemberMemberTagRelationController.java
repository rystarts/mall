package com.rystars.mall.admin.ums.member.controller;

import com.rystars.mall.admin.ums.member.bean.UmsMemberMemberTagRelation;
import com.rystars.mall.admin.ums.member.service.UmsMemberMemberTagRelationService;
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
 * 【ums_member_member_tag_relation(用户和标签关系表)】Controller
 * @author rystars
 * @date 2023-04-13 10:58:51
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/member/member/tag/relation")
@Tag(name = "UmsMemberMemberTagRelationController", description = "用户和标签关系表")
public class UmsMemberMemberTagRelationController {

    private final UmsMemberMemberTagRelationService umsMemberMemberTagRelationService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<UmsMemberMemberTagRelation> save(@Parameter(name = "用户和标签关系表", required = true)
                                                     @RequestBody UmsMemberMemberTagRelation umsMemberMemberTagRelation) {
        return Result.instance(umsMemberMemberTagRelationService.save(umsMemberMemberTagRelation));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<UmsMemberMemberTagRelation> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody UmsMemberMemberTagRelation umsMemberMemberTagRelation) {
        boolean result = umsMemberMemberTagRelationService.update(umsMemberMemberTagRelation, new UpdateWrapper<UmsMemberMemberTagRelation>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<UmsMemberMemberTagRelation> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(umsMemberMemberTagRelationService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<UmsMemberMemberTagRelation> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(umsMemberMemberTagRelationService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<UmsMemberMemberTagRelation>> queryAll() {
        return Result.success(umsMemberMemberTagRelationService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<UmsMemberMemberTagRelation>> queryPage(@RequestBody PageParam page) {
        return Result.success(umsMemberMemberTagRelationService.queryPage(page, null));
    }

}
