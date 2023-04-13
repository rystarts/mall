package com.rystars.mall.admin.sms.home.controller;

import com.rystars.mall.admin.sms.home.bean.SmsHomeNewProduct;
import com.rystars.mall.admin.sms.home.service.SmsHomeNewProductService;
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
 * 【sms_home_new_product(新鲜好物表)】Controller
 * @author rystars
 * @date 2023-04-13 10:54:46
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sms/home/new/product")
@Tag(name = "SmsHomeNewProductController", description = "新鲜好物表")
public class SmsHomeNewProductController {

    private final SmsHomeNewProductService smsHomeNewProductService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<SmsHomeNewProduct> save(@Parameter(name = "新鲜好物表", required = true)
                                                     @RequestBody SmsHomeNewProduct smsHomeNewProduct) {
        return Result.instance(smsHomeNewProductService.save(smsHomeNewProduct));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<SmsHomeNewProduct> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody SmsHomeNewProduct smsHomeNewProduct) {
        boolean result = smsHomeNewProductService.update(smsHomeNewProduct, new UpdateWrapper<SmsHomeNewProduct>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<SmsHomeNewProduct> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(smsHomeNewProductService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<SmsHomeNewProduct> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(smsHomeNewProductService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<SmsHomeNewProduct>> queryAll() {
        return Result.success(smsHomeNewProductService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<SmsHomeNewProduct>> queryPage(@RequestBody PageParam page) {
        return Result.success(smsHomeNewProductService.queryPage(page, null));
    }

}
