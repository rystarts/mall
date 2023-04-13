package com.rystars.mall.admin.sms.flash.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.sms.flash.bean.SmsFlashPromotionLog;
import com.rystars.mall.admin.sms.flash.service.SmsFlashPromotionLogService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【sms_flash_promotion_log(限时购通知记录)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:54:34
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sms/flash/promotion/log")
@Tag(name = "SmsFlashPromotionLogController", description = "限时购通知记录")
public class SmsFlashPromotionLogController {

    private final SmsFlashPromotionLogService smsFlashPromotionLogService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<SmsFlashPromotionLog> save(@Parameter(name = "限时购通知记录", required = true)
                                             @RequestBody SmsFlashPromotionLog smsFlashPromotionLog) {
        return Result.instance(smsFlashPromotionLogService.save(smsFlashPromotionLog));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<SmsFlashPromotionLog> update(@Parameter(name = "主键", required = true)
                                               @PathVariable(value = "id") String id,
                                               @RequestBody SmsFlashPromotionLog smsFlashPromotionLog) {
        boolean result = smsFlashPromotionLogService.update(smsFlashPromotionLog, new UpdateWrapper<SmsFlashPromotionLog>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<SmsFlashPromotionLog> delete(@Parameter(name = "主键", required = true)
                                               @PathVariable(value = "id") String id) {
        return Result.instance(smsFlashPromotionLogService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<SmsFlashPromotionLog> queryById(@Parameter(name = "主键", required = true)
                                                  @PathVariable(value = "id") String id) {
        return Result.success(smsFlashPromotionLogService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<SmsFlashPromotionLog>> queryAll() {
        return Result.success(smsFlashPromotionLogService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<SmsFlashPromotionLog>> queryPage(@RequestBody PageParam page) {
        return Result.success(smsFlashPromotionLogService.queryPage(page, null));
    }

}
