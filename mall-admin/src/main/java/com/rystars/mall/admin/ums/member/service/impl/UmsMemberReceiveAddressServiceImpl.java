package com.rystars.mall.admin.ums.member.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.ums.member.bean.UmsMemberReceiveAddress;
import com.rystars.mall.admin.ums.member.mapper.UmsMemberReceiveAddressMapper;
import com.rystars.mall.admin.ums.member.service.UmsMemberReceiveAddressService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【ums_member_receive_address(会员收货地址表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-13 10:58:51
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UmsMemberReceiveAddressServiceImpl extends IBaseServiceImpl<UmsMemberReceiveAddressMapper, UmsMemberReceiveAddress> implements UmsMemberReceiveAddressService {

    private final UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

}




