package com.rystars.mall.admin.sms.home.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.sms.home.bean.SmsHomeAdvertise;
import com.rystars.mall.admin.sms.home.service.SmsHomeAdvertiseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【sms_home_advertise(首页轮播广告表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:54:46
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sms/home/advertise")
@Tag(name = "SmsHomeAdvertiseController", description = "首页轮播广告表")
public class SmsHomeAdvertiseController {

    private final SmsHomeAdvertiseService smsHomeAdvertiseService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<SmsHomeAdvertise> save(@Parameter(name = "首页轮播广告表", required = true)
                                         @RequestBody SmsHomeAdvertise smsHomeAdvertise) {
        return Result.instance(smsHomeAdvertiseService.save(smsHomeAdvertise));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<SmsHomeAdvertise> update(@Parameter(name = "主键", required = true)
                                           @PathVariable(value = "id") String id,
                                           @RequestBody SmsHomeAdvertise smsHomeAdvertise) {
        boolean result = smsHomeAdvertiseService.update(smsHomeAdvertise, new UpdateWrapper<SmsHomeAdvertise>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<SmsHomeAdvertise> delete(@Parameter(name = "主键", required = true)
                                           @PathVariable(value = "id") String id) {
        return Result.instance(smsHomeAdvertiseService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<SmsHomeAdvertise> queryById(@Parameter(name = "主键", required = true)
                                              @PathVariable(value = "id") String id) {
        return Result.success(smsHomeAdvertiseService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<SmsHomeAdvertise>> queryAll() {
        return Result.success(smsHomeAdvertiseService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<SmsHomeAdvertise>> queryPage(@RequestBody PageParam page) {
        return Result.success(smsHomeAdvertiseService.queryPage(page, null));
    }

}
