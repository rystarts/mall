package com.rystars.mall.admin.pms.comment.controller;

import com.rystars.mall.admin.pms.comment.bean.PmsComment;
import com.rystars.mall.admin.pms.comment.service.PmsCommentService;
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
 * 【pms_comment(商品评价表)】Controller
 * @author rystars
 * @date 2023-04-13 10:50:29
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/comment")
@Tag(name = "PmsCommentController", description = "商品评价表")
public class PmsCommentController {

    private final PmsCommentService pmsCommentService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<PmsComment> save(@Parameter(name = "商品评价表", required = true)
                                                     @RequestBody PmsComment pmsComment) {
        return Result.instance(pmsCommentService.save(pmsComment));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<PmsComment> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody PmsComment pmsComment) {
        boolean result = pmsCommentService.update(pmsComment, new UpdateWrapper<PmsComment>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<PmsComment> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(pmsCommentService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<PmsComment> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(pmsCommentService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<PmsComment>> queryAll() {
        return Result.success(pmsCommentService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<PmsComment>> queryPage(@RequestBody PageParam page) {
        return Result.success(pmsCommentService.queryPage(page, null));
    }

}
