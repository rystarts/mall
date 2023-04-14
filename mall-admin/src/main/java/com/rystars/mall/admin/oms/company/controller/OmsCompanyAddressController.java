package com.rystars.mall.admin.oms.company.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.oms.company.bean.OmsCompanyAddress;
import com.rystars.mall.admin.oms.company.service.OmsCompanyAddressService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【oms_company_address(公司收发货地址表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:10:28
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/oms/company/address")
@Tag(name = "OmsCompanyAddressController", description = "公司收发货地址表")
public class OmsCompanyAddressController implements IBaseController<OmsCompanyAddressService, OmsCompanyAddress> {

    private final OmsCompanyAddressService omsCompanyAddressService;

    @Override
    public OmsCompanyAddressService getService() {
        return omsCompanyAddressService;
    }

}
