package com.rystars.mall.admin.pms.member.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.pms.member.bean.PmsMemberPrice;
import com.rystars.mall.admin.pms.member.mapper.PmsMemberPriceMapper;
import com.rystars.mall.admin.pms.member.service.PmsMemberPriceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【pms_member_price(商品会员价格表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:11:21
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class PmsMemberPriceServiceImpl extends IBaseServiceImpl<PmsMemberPriceMapper, PmsMemberPrice> implements PmsMemberPriceService {

    private final PmsMemberPriceMapper pmsMemberPriceMapper;

}




