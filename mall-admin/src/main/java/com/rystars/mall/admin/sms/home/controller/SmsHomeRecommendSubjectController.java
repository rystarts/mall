package com.rystars.mall.admin.sms.home.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.sms.home.bean.SmsHomeRecommendSubject;
import com.rystars.mall.admin.sms.home.service.SmsHomeRecommendSubjectService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【sms_home_recommend_subject(首页推荐专题表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:12:11
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/sms/home/recommend/subject")
@Tag(name = "SmsHomeRecommendSubjectController", description = "首页推荐专题表")
public class SmsHomeRecommendSubjectController implements IBaseController<SmsHomeRecommendSubjectService, SmsHomeRecommendSubject> {

    private final SmsHomeRecommendSubjectService smsHomeRecommendSubjectService;

    @Override
    public SmsHomeRecommendSubjectService getService() {
        return smsHomeRecommendSubjectService;
    }

}
