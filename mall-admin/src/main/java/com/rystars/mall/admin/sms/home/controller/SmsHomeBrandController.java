package com.rystars.mall.admin.sms.home.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.sms.home.bean.SmsHomeBrand;
import com.rystars.mall.admin.sms.home.service.SmsHomeBrandService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【sms_home_brand(首页推荐品牌表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:54:46
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sms/home/brand")
@Tag(name = "SmsHomeBrandController", description = "首页推荐品牌表")
public class SmsHomeBrandController {

    private final SmsHomeBrandService smsHomeBrandService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<SmsHomeBrand> save(@Parameter(name = "首页推荐品牌表", required = true)
                                     @RequestBody SmsHomeBrand smsHomeBrand) {
        return Result.instance(smsHomeBrandService.save(smsHomeBrand));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<SmsHomeBrand> update(@Parameter(name = "主键", required = true)
                                       @PathVariable(value = "id") String id,
                                       @RequestBody SmsHomeBrand smsHomeBrand) {
        boolean result = smsHomeBrandService.update(smsHomeBrand, new UpdateWrapper<SmsHomeBrand>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<SmsHomeBrand> delete(@Parameter(name = "主键", required = true)
                                       @PathVariable(value = "id") String id) {
        return Result.instance(smsHomeBrandService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<SmsHomeBrand> queryById(@Parameter(name = "主键", required = true)
                                          @PathVariable(value = "id") String id) {
        return Result.success(smsHomeBrandService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<SmsHomeBrand>> queryAll() {
        return Result.success(smsHomeBrandService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<SmsHomeBrand>> queryPage(@RequestBody PageParam page) {
        return Result.success(smsHomeBrandService.queryPage(page, null));
    }

}
