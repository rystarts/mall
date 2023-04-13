package com.rystars.mall.admin.pms.product.controller;

import com.rystars.mall.admin.pms.product.bean.PmsProductVertifyRecord;
import com.rystars.mall.admin.pms.product.service.PmsProductVertifyRecordService;
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
 * 【pms_product_vertify_record(商品审核记录)】Controller
 * @author rystars
 * @date 2023-04-13 10:50:57
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/product/vertify/record")
@Tag(name = "PmsProductVertifyRecordController", description = "商品审核记录")
public class PmsProductVertifyRecordController {

    private final PmsProductVertifyRecordService pmsProductVertifyRecordService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<PmsProductVertifyRecord> save(@Parameter(name = "商品审核记录", required = true)
                                                     @RequestBody PmsProductVertifyRecord pmsProductVertifyRecord) {
        return Result.instance(pmsProductVertifyRecordService.save(pmsProductVertifyRecord));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<PmsProductVertifyRecord> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody PmsProductVertifyRecord pmsProductVertifyRecord) {
        boolean result = pmsProductVertifyRecordService.update(pmsProductVertifyRecord, new UpdateWrapper<PmsProductVertifyRecord>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<PmsProductVertifyRecord> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(pmsProductVertifyRecordService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<PmsProductVertifyRecord> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(pmsProductVertifyRecordService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<PmsProductVertifyRecord>> queryAll() {
        return Result.success(pmsProductVertifyRecordService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<PmsProductVertifyRecord>> queryPage(@RequestBody PageParam page) {
        return Result.success(pmsProductVertifyRecordService.queryPage(page, null));
    }

}
