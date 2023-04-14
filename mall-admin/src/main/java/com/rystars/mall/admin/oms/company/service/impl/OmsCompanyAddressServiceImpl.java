package com.rystars.mall.admin.oms.company.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.oms.company.bean.OmsCompanyAddress;
import com.rystars.mall.admin.oms.company.mapper.OmsCompanyAddressMapper;
import com.rystars.mall.admin.oms.company.service.OmsCompanyAddressService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【oms_company_address(公司收发货地址表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:10:28
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class OmsCompanyAddressServiceImpl extends IBaseServiceImpl<OmsCompanyAddressMapper, OmsCompanyAddress> implements OmsCompanyAddressService {

    private final OmsCompanyAddressMapper omsCompanyAddressMapper;

}




