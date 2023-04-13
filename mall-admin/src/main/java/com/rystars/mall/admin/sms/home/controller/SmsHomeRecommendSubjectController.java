package com.rystars.mall.admin.sms.home.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.sms.home.bean.SmsHomeRecommendSubject;
import com.rystars.mall.admin.sms.home.service.SmsHomeRecommendSubjectService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【sms_home_recommend_subject(首页推荐专题表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:54:47
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sms/home/recommend/subject")
@Tag(name = "SmsHomeRecommendSubjectController", description = "首页推荐专题表")
public class SmsHomeRecommendSubjectController {

    private final SmsHomeRecommendSubjectService smsHomeRecommendSubjectService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<SmsHomeRecommendSubject> save(@Parameter(name = "首页推荐专题表", required = true)
                                                @RequestBody SmsHomeRecommendSubject smsHomeRecommendSubject) {
        return Result.instance(smsHomeRecommendSubjectService.save(smsHomeRecommendSubject));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<SmsHomeRecommendSubject> update(@Parameter(name = "主键", required = true)
                                                  @PathVariable(value = "id") String id,
                                                  @RequestBody SmsHomeRecommendSubject smsHomeRecommendSubject) {
        boolean result = smsHomeRecommendSubjectService.update(smsHomeRecommendSubject, new UpdateWrapper<SmsHomeRecommendSubject>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<SmsHomeRecommendSubject> delete(@Parameter(name = "主键", required = true)
                                                  @PathVariable(value = "id") String id) {
        return Result.instance(smsHomeRecommendSubjectService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<SmsHomeRecommendSubject> queryById(@Parameter(name = "主键", required = true)
                                                     @PathVariable(value = "id") String id) {
        return Result.success(smsHomeRecommendSubjectService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<SmsHomeRecommendSubject>> queryAll() {
        return Result.success(smsHomeRecommendSubjectService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<SmsHomeRecommendSubject>> queryPage(@RequestBody PageParam page) {
        return Result.success(smsHomeRecommendSubjectService.queryPage(page, null));
    }

}
