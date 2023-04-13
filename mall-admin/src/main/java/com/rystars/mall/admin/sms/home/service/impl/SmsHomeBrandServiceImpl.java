package com.rystars.mall.admin.sms.home.service.impl;

import com.rystars.mall.admin.sms.home.bean.SmsHomeBrand;
import com.rystars.mall.admin.sms.home.service.SmsHomeBrandService;
import com.rystars.mall.admin.sms.home.mapper.SmsHomeBrandMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【sms_home_brand(首页推荐品牌表)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:54:46
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class SmsHomeBrandServiceImpl extends IBaseServiceImpl<SmsHomeBrandMapper, SmsHomeBrand> implements SmsHomeBrandService{

    private final SmsHomeBrandMapper smsHomeBrandMapper;

}




