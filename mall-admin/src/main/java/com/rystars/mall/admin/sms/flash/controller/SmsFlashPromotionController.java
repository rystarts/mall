package com.rystars.mall.admin.sms.flash.controller;

import com.rystars.mall.admin.sms.flash.bean.SmsFlashPromotion;
import com.rystars.mall.admin.sms.flash.service.SmsFlashPromotionService;
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
 * 【sms_flash_promotion(限时购表)】Controller
 * @author rystars
 * @date 2023-04-13 10:54:34
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sms/flash/promotion")
@Tag(name = "SmsFlashPromotionController", description = "限时购表")
public class SmsFlashPromotionController {

    private final SmsFlashPromotionService smsFlashPromotionService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<SmsFlashPromotion> save(@Parameter(name = "限时购表", required = true)
                                                     @RequestBody SmsFlashPromotion smsFlashPromotion) {
        return Result.instance(smsFlashPromotionService.save(smsFlashPromotion));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<SmsFlashPromotion> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody SmsFlashPromotion smsFlashPromotion) {
        boolean result = smsFlashPromotionService.update(smsFlashPromotion, new UpdateWrapper<SmsFlashPromotion>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<SmsFlashPromotion> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(smsFlashPromotionService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<SmsFlashPromotion> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(smsFlashPromotionService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<SmsFlashPromotion>> queryAll() {
        return Result.success(smsFlashPromotionService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<SmsFlashPromotion>> queryPage(@RequestBody PageParam page) {
        return Result.success(smsFlashPromotionService.queryPage(page, null));
    }

}
