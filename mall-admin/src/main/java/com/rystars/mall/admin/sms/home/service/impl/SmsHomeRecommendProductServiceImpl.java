package com.rystars.mall.admin.sms.home.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.sms.home.bean.SmsHomeRecommendProduct;
import com.rystars.mall.admin.sms.home.mapper.SmsHomeRecommendProductMapper;
import com.rystars.mall.admin.sms.home.service.SmsHomeRecommendProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【sms_home_recommend_product(人气推荐商品表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:12:11
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class SmsHomeRecommendProductServiceImpl extends IBaseServiceImpl<SmsHomeRecommendProductMapper, SmsHomeRecommendProduct> implements SmsHomeRecommendProductService {

    private final SmsHomeRecommendProductMapper smsHomeRecommendProductMapper;

}




