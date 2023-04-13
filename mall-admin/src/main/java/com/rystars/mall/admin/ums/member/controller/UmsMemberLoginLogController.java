package com.rystars.mall.admin.ums.member.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.ums.member.bean.UmsMemberLoginLog;
import com.rystars.mall.admin.ums.member.service.UmsMemberLoginLogService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【ums_member_login_log(会员登录记录)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:58:51
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/member/login/log")
@Tag(name = "UmsMemberLoginLogController", description = "会员登录记录")
public class UmsMemberLoginLogController {

    private final UmsMemberLoginLogService umsMemberLoginLogService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<UmsMemberLoginLog> save(@Parameter(name = "会员登录记录", required = true)
                                          @RequestBody UmsMemberLoginLog umsMemberLoginLog) {
        return Result.instance(umsMemberLoginLogService.save(umsMemberLoginLog));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<UmsMemberLoginLog> update(@Parameter(name = "主键", required = true)
                                            @PathVariable(value = "id") String id,
                                            @RequestBody UmsMemberLoginLog umsMemberLoginLog) {
        boolean result = umsMemberLoginLogService.update(umsMemberLoginLog, new UpdateWrapper<UmsMemberLoginLog>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<UmsMemberLoginLog> delete(@Parameter(name = "主键", required = true)
                                            @PathVariable(value = "id") String id) {
        return Result.instance(umsMemberLoginLogService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<UmsMemberLoginLog> queryById(@Parameter(name = "主键", required = true)
                                               @PathVariable(value = "id") String id) {
        return Result.success(umsMemberLoginLogService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<UmsMemberLoginLog>> queryAll() {
        return Result.success(umsMemberLoginLogService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<UmsMemberLoginLog>> queryPage(@RequestBody PageParam page) {
        return Result.success(umsMemberLoginLogService.queryPage(page, null));
    }

}
