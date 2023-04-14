package com.rystars.mall.admin.ums.member.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.ums.member.bean.UmsMemberReceiveAddress;
import com.rystars.mall.admin.ums.member.service.UmsMemberReceiveAddressService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【ums_member_receive_address(会员收货地址表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:12:53
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/member/receive/address")
@Tag(name = "UmsMemberReceiveAddressController", description = "会员收货地址表")
public class UmsMemberReceiveAddressController implements IBaseController<UmsMemberReceiveAddressService, UmsMemberReceiveAddress> {

    private final UmsMemberReceiveAddressService umsMemberReceiveAddressService;

    @Override
    public UmsMemberReceiveAddressService getService() {
        return umsMemberReceiveAddressService;
    }

}
