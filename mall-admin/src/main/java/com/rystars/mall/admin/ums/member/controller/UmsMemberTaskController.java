package com.rystars.mall.admin.ums.member.controller;

import com.rystars.mall.admin.ums.member.bean.UmsMemberTask;
import com.rystars.mall.admin.ums.member.service.UmsMemberTaskService;
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
 * 【ums_member_task(会员任务表)】Controller
 * @author rystars
 * @date 2023-04-13 10:58:52
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/member/task")
@Tag(name = "UmsMemberTaskController", description = "会员任务表")
public class UmsMemberTaskController {

    private final UmsMemberTaskService umsMemberTaskService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<UmsMemberTask> save(@Parameter(name = "会员任务表", required = true)
                                                     @RequestBody UmsMemberTask umsMemberTask) {
        return Result.instance(umsMemberTaskService.save(umsMemberTask));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<UmsMemberTask> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody UmsMemberTask umsMemberTask) {
        boolean result = umsMemberTaskService.update(umsMemberTask, new UpdateWrapper<UmsMemberTask>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<UmsMemberTask> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(umsMemberTaskService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<UmsMemberTask> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(umsMemberTaskService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<UmsMemberTask>> queryAll() {
        return Result.success(umsMemberTaskService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<UmsMemberTask>> queryPage(@RequestBody PageParam page) {
        return Result.success(umsMemberTaskService.queryPage(page, null));
    }

}
