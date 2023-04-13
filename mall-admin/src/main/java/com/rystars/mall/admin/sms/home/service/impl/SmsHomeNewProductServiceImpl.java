package com.rystars.mall.admin.sms.home.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.sms.home.bean.SmsHomeNewProduct;
import com.rystars.mall.admin.sms.home.mapper.SmsHomeNewProductMapper;
import com.rystars.mall.admin.sms.home.service.SmsHomeNewProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【sms_home_new_product(新鲜好物表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-13 10:54:46
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class SmsHomeNewProductServiceImpl extends IBaseServiceImpl<SmsHomeNewProductMapper, SmsHomeNewProduct> implements SmsHomeNewProductService {

    private final SmsHomeNewProductMapper smsHomeNewProductMapper;

}




