package com.rystars.mall.admin.sms.home.controller;

import com.rystars.mall.admin.sms.home.bean.SmsHomeRecommendProduct;
import com.rystars.mall.admin.sms.home.service.SmsHomeRecommendProductService;
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
 * 【sms_home_recommend_product(人气推荐商品表)】Controller
 * @author rystars
 * @date 2023-04-13 10:54:46
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sms/home/recommend/product")
@Tag(name = "SmsHomeRecommendProductController", description = "人气推荐商品表")
public class SmsHomeRecommendProductController {

    private final SmsHomeRecommendProductService smsHomeRecommendProductService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<SmsHomeRecommendProduct> save(@Parameter(name = "人气推荐商品表", required = true)
                                                     @RequestBody SmsHomeRecommendProduct smsHomeRecommendProduct) {
        return Result.instance(smsHomeRecommendProductService.save(smsHomeRecommendProduct));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<SmsHomeRecommendProduct> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody SmsHomeRecommendProduct smsHomeRecommendProduct) {
        boolean result = smsHomeRecommendProductService.update(smsHomeRecommendProduct, new UpdateWrapper<SmsHomeRecommendProduct>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<SmsHomeRecommendProduct> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(smsHomeRecommendProductService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<SmsHomeRecommendProduct> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(smsHomeRecommendProductService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<SmsHomeRecommendProduct>> queryAll() {
        return Result.success(smsHomeRecommendProductService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<SmsHomeRecommendProduct>> queryPage(@RequestBody PageParam page) {
        return Result.success(smsHomeRecommendProductService.queryPage(page, null));
    }

}
