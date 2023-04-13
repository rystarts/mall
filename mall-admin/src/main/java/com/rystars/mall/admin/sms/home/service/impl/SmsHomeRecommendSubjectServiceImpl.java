package com.rystars.mall.admin.sms.home.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.sms.home.bean.SmsHomeRecommendSubject;
import com.rystars.mall.admin.sms.home.mapper.SmsHomeRecommendSubjectMapper;
import com.rystars.mall.admin.sms.home.service.SmsHomeRecommendSubjectService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【sms_home_recommend_subject(首页推荐专题表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-13 10:54:47
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class SmsHomeRecommendSubjectServiceImpl extends IBaseServiceImpl<SmsHomeRecommendSubjectMapper, SmsHomeRecommendSubject> implements SmsHomeRecommendSubjectService {

    private final SmsHomeRecommendSubjectMapper smsHomeRecommendSubjectMapper;

}




