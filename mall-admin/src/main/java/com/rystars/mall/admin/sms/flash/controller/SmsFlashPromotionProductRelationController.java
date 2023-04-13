package com.rystars.mall.admin.sms.flash.controller;

import com.rystars.mall.admin.sms.flash.bean.SmsFlashPromotionProductRelation;
import com.rystars.mall.admin.sms.flash.service.SmsFlashPromotionProductRelationService;
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
 * 【sms_flash_promotion_product_relation(商品限时购与商品关系表)】Controller
 * @author rystars
 * @date 2023-04-13 10:54:34
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sms/flash/promotion/product/relation")
@Tag(name = "SmsFlashPromotionProductRelationController", description = "商品限时购与商品关系表")
public class SmsFlashPromotionProductRelationController {

    private final SmsFlashPromotionProductRelationService smsFlashPromotionProductRelationService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<SmsFlashPromotionProductRelation> save(@Parameter(name = "商品限时购与商品关系表", required = true)
                                                     @RequestBody SmsFlashPromotionProductRelation smsFlashPromotionProductRelation) {
        return Result.instance(smsFlashPromotionProductRelationService.save(smsFlashPromotionProductRelation));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<SmsFlashPromotionProductRelation> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody SmsFlashPromotionProductRelation smsFlashPromotionProductRelation) {
        boolean result = smsFlashPromotionProductRelationService.update(smsFlashPromotionProductRelation, new UpdateWrapper<SmsFlashPromotionProductRelation>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<SmsFlashPromotionProductRelation> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(smsFlashPromotionProductRelationService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<SmsFlashPromotionProductRelation> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(smsFlashPromotionProductRelationService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<SmsFlashPromotionProductRelation>> queryAll() {
        return Result.success(smsFlashPromotionProductRelationService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<SmsFlashPromotionProductRelation>> queryPage(@RequestBody PageParam page) {
        return Result.success(smsFlashPromotionProductRelationService.queryPage(page, null));
    }

}
