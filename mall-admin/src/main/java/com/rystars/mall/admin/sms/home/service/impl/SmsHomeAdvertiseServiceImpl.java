package com.rystars.mall.admin.sms.home.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.sms.home.bean.SmsHomeAdvertise;
import com.rystars.mall.admin.sms.home.mapper.SmsHomeAdvertiseMapper;
import com.rystars.mall.admin.sms.home.service.SmsHomeAdvertiseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【sms_home_advertise(首页轮播广告表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:12:10
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class SmsHomeAdvertiseServiceImpl extends IBaseServiceImpl<SmsHomeAdvertiseMapper, SmsHomeAdvertise> implements SmsHomeAdvertiseService {

    private final SmsHomeAdvertiseMapper smsHomeAdvertiseMapper;

}




