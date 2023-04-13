package com.rystars.mall.admin.cms.member.controller;

import com.rystars.mall.admin.cms.member.bean.CmsMemberReport;
import com.rystars.mall.admin.cms.member.service.CmsMemberReportService;
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
 * 【cms_member_report(用户举报表)】Controller
 * @author rystars
 * @date 2023-04-13 10:38:40
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cms/member/report")
@Tag(name = "CmsMemberReportController", description = "用户举报表")
public class CmsMemberReportController {

    private final CmsMemberReportService cmsMemberReportService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<CmsMemberReport> save(@Parameter(name = "用户举报表", required = true)
                                                     @RequestBody CmsMemberReport cmsMemberReport) {
        return Result.instance(cmsMemberReportService.save(cmsMemberReport));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<CmsMemberReport> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody CmsMemberReport cmsMemberReport) {
        boolean result = cmsMemberReportService.update(cmsMemberReport, new UpdateWrapper<CmsMemberReport>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<CmsMemberReport> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(cmsMemberReportService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<CmsMemberReport> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(cmsMemberReportService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<CmsMemberReport>> queryAll() {
        return Result.success(cmsMemberReportService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<CmsMemberReport>> queryPage(@RequestBody PageParam page) {
        return Result.success(cmsMemberReportService.queryPage(page, null));
    }

}
