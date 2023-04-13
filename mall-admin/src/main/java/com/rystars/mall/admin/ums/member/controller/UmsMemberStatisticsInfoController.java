package com.rystars.mall.admin.ums.member.controller;

import com.rystars.mall.admin.ums.member.bean.UmsMemberStatisticsInfo;
import com.rystars.mall.admin.ums.member.service.UmsMemberStatisticsInfoService;
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
 * 【ums_member_statistics_info(会员统计信息)】Controller
 * @author rystars
 * @date 2023-04-13 10:58:51
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/member/statistics/info")
@Tag(name = "UmsMemberStatisticsInfoController", description = "会员统计信息")
public class UmsMemberStatisticsInfoController {

    private final UmsMemberStatisticsInfoService umsMemberStatisticsInfoService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<UmsMemberStatisticsInfo> save(@Parameter(name = "会员统计信息", required = true)
                                                     @RequestBody UmsMemberStatisticsInfo umsMemberStatisticsInfo) {
        return Result.instance(umsMemberStatisticsInfoService.save(umsMemberStatisticsInfo));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<UmsMemberStatisticsInfo> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody UmsMemberStatisticsInfo umsMemberStatisticsInfo) {
        boolean result = umsMemberStatisticsInfoService.update(umsMemberStatisticsInfo, new UpdateWrapper<UmsMemberStatisticsInfo>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<UmsMemberStatisticsInfo> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(umsMemberStatisticsInfoService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<UmsMemberStatisticsInfo> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(umsMemberStatisticsInfoService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<UmsMemberStatisticsInfo>> queryAll() {
        return Result.success(umsMemberStatisticsInfoService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<UmsMemberStatisticsInfo>> queryPage(@RequestBody PageParam page) {
        return Result.success(umsMemberStatisticsInfoService.queryPage(page, null));
    }

}
