package com.rystars.mall.admin.pms.comment.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.pms.comment.bean.PmsCommentReplay;
import com.rystars.mall.admin.pms.comment.service.PmsCommentReplayService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【pms_comment_replay(产品评价回复表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:50:29
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/comment/replay")
@Tag(name = "PmsCommentReplayController", description = "产品评价回复表")
public class PmsCommentReplayController {

    private final PmsCommentReplayService pmsCommentReplayService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<PmsCommentReplay> save(@Parameter(name = "产品评价回复表", required = true)
                                         @RequestBody PmsCommentReplay pmsCommentReplay) {
        return Result.instance(pmsCommentReplayService.save(pmsCommentReplay));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<PmsCommentReplay> update(@Parameter(name = "主键", required = true)
                                           @PathVariable(value = "id") String id,
                                           @RequestBody PmsCommentReplay pmsCommentReplay) {
        boolean result = pmsCommentReplayService.update(pmsCommentReplay, new UpdateWrapper<PmsCommentReplay>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<PmsCommentReplay> delete(@Parameter(name = "主键", required = true)
                                           @PathVariable(value = "id") String id) {
        return Result.instance(pmsCommentReplayService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<PmsCommentReplay> queryById(@Parameter(name = "主键", required = true)
                                              @PathVariable(value = "id") String id) {
        return Result.success(pmsCommentReplayService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<PmsCommentReplay>> queryAll() {
        return Result.success(pmsCommentReplayService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<PmsCommentReplay>> queryPage(@RequestBody PageParam page) {
        return Result.success(pmsCommentReplayService.queryPage(page, null));
    }

}
