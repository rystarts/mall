package com.rystars.mall.admin.pms.product.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.pms.product.bean.PmsProductOperateLog;
import com.rystars.mall.admin.pms.product.service.PmsProductOperateLogService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【pms_product_operate_log】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:50:57
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/product/operate/log")
@Tag(name = "PmsProductOperateLogController", description = "")
public class PmsProductOperateLogController {

    private final PmsProductOperateLogService pmsProductOperateLogService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<PmsProductOperateLog> save(@Parameter(name = "", required = true)
                                             @RequestBody PmsProductOperateLog pmsProductOperateLog) {
        return Result.instance(pmsProductOperateLogService.save(pmsProductOperateLog));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<PmsProductOperateLog> update(@Parameter(name = "主键", required = true)
                                               @PathVariable(value = "id") String id,
                                               @RequestBody PmsProductOperateLog pmsProductOperateLog) {
        boolean result = pmsProductOperateLogService.update(pmsProductOperateLog, new UpdateWrapper<PmsProductOperateLog>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<PmsProductOperateLog> delete(@Parameter(name = "主键", required = true)
                                               @PathVariable(value = "id") String id) {
        return Result.instance(pmsProductOperateLogService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<PmsProductOperateLog> queryById(@Parameter(name = "主键", required = true)
                                                  @PathVariable(value = "id") String id) {
        return Result.success(pmsProductOperateLogService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<PmsProductOperateLog>> queryAll() {
        return Result.success(pmsProductOperateLogService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<PmsProductOperateLog>> queryPage(@RequestBody PageParam page) {
        return Result.success(pmsProductOperateLogService.queryPage(page, null));
    }

}
