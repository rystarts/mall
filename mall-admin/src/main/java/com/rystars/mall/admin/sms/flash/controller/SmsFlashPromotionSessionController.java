package com.rystars.mall.admin.sms.flash.controller;

import com.rystars.mall.admin.sms.flash.bean.SmsFlashPromotionSession;
import com.rystars.mall.admin.sms.flash.service.SmsFlashPromotionSessionService;
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
 * 【sms_flash_promotion_session(限时购场次表)】Controller
 * @author rystars
 * @date 2023-04-13 10:54:34
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sms/flash/promotion/session")
@Tag(name = "SmsFlashPromotionSessionController", description = "限时购场次表")
public class SmsFlashPromotionSessionController {

    private final SmsFlashPromotionSessionService smsFlashPromotionSessionService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<SmsFlashPromotionSession> save(@Parameter(name = "限时购场次表", required = true)
                                                     @RequestBody SmsFlashPromotionSession smsFlashPromotionSession) {
        return Result.instance(smsFlashPromotionSessionService.save(smsFlashPromotionSession));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<SmsFlashPromotionSession> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody SmsFlashPromotionSession smsFlashPromotionSession) {
        boolean result = smsFlashPromotionSessionService.update(smsFlashPromotionSession, new UpdateWrapper<SmsFlashPromotionSession>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<SmsFlashPromotionSession> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(smsFlashPromotionSessionService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<SmsFlashPromotionSession> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(smsFlashPromotionSessionService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<SmsFlashPromotionSession>> queryAll() {
        return Result.success(smsFlashPromotionSessionService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<SmsFlashPromotionSession>> queryPage(@RequestBody PageParam page) {
        return Result.success(smsFlashPromotionSessionService.queryPage(page, null));
    }

}
