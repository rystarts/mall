package com.rystars.mall.admin.pms.member.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.pms.member.bean.PmsMemberPrice;
import com.rystars.mall.admin.pms.member.service.PmsMemberPriceService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【pms_member_price(商品会员价格表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:11:20
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/member/price")
@Tag(name = "PmsMemberPriceController", description = "商品会员价格表")
public class PmsMemberPriceController implements IBaseController<PmsMemberPriceService, PmsMemberPrice> {

    private final PmsMemberPriceService pmsMemberPriceService;

    @Override
    public PmsMemberPriceService getService() {
        return pmsMemberPriceService;
    }

}
