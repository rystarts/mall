package com.rystars.mall.admin.pms.product.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.pms.product.bean.PmsProductAttribute;
import com.rystars.mall.admin.pms.product.service.PmsProductAttributeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【pms_product_attribute(商品属性参数表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:50:56
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/product/attribute")
@Tag(name = "PmsProductAttributeController", description = "商品属性参数表")
public class PmsProductAttributeController {

    private final PmsProductAttributeService pmsProductAttributeService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<PmsProductAttribute> save(@Parameter(name = "商品属性参数表", required = true)
                                            @RequestBody PmsProductAttribute pmsProductAttribute) {
        return Result.instance(pmsProductAttributeService.save(pmsProductAttribute));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<PmsProductAttribute> update(@Parameter(name = "主键", required = true)
                                              @PathVariable(value = "id") String id,
                                              @RequestBody PmsProductAttribute pmsProductAttribute) {
        boolean result = pmsProductAttributeService.update(pmsProductAttribute, new UpdateWrapper<PmsProductAttribute>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<PmsProductAttribute> delete(@Parameter(name = "主键", required = true)
                                              @PathVariable(value = "id") String id) {
        return Result.instance(pmsProductAttributeService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<PmsProductAttribute> queryById(@Parameter(name = "主键", required = true)
                                                 @PathVariable(value = "id") String id) {
        return Result.success(pmsProductAttributeService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<PmsProductAttribute>> queryAll() {
        return Result.success(pmsProductAttributeService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<PmsProductAttribute>> queryPage(@RequestBody PageParam page) {
        return Result.success(pmsProductAttributeService.queryPage(page, null));
    }

}
