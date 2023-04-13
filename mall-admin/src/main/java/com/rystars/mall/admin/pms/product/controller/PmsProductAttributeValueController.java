package com.rystars.mall.admin.pms.product.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.pms.product.bean.PmsProductAttributeValue;
import com.rystars.mall.admin.pms.product.service.PmsProductAttributeValueService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【pms_product_attribute_value(存储产品参数信息的表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:50:56
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/product/attribute/value")
@Tag(name = "PmsProductAttributeValueController", description = "存储产品参数信息的表")
public class PmsProductAttributeValueController {

    private final PmsProductAttributeValueService pmsProductAttributeValueService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<PmsProductAttributeValue> save(@Parameter(name = "存储产品参数信息的表", required = true)
                                                 @RequestBody PmsProductAttributeValue pmsProductAttributeValue) {
        return Result.instance(pmsProductAttributeValueService.save(pmsProductAttributeValue));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<PmsProductAttributeValue> update(@Parameter(name = "主键", required = true)
                                                   @PathVariable(value = "id") String id,
                                                   @RequestBody PmsProductAttributeValue pmsProductAttributeValue) {
        boolean result = pmsProductAttributeValueService.update(pmsProductAttributeValue, new UpdateWrapper<PmsProductAttributeValue>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<PmsProductAttributeValue> delete(@Parameter(name = "主键", required = true)
                                                   @PathVariable(value = "id") String id) {
        return Result.instance(pmsProductAttributeValueService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<PmsProductAttributeValue> queryById(@Parameter(name = "主键", required = true)
                                                      @PathVariable(value = "id") String id) {
        return Result.success(pmsProductAttributeValueService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<PmsProductAttributeValue>> queryAll() {
        return Result.success(pmsProductAttributeValueService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<PmsProductAttributeValue>> queryPage(@RequestBody PageParam page) {
        return Result.success(pmsProductAttributeValueService.queryPage(page, null));
    }

}
