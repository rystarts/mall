package com.rystars.mall.admin.pms.product.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.pms.product.bean.PmsProductLadder;
import com.rystars.mall.admin.pms.product.service.PmsProductLadderService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【pms_product_ladder(产品阶梯价格表(只针对同商品))】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:11:31
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/product/ladder")
@Tag(name = "PmsProductLadderController", description = "产品阶梯价格表(只针对同商品)")
public class PmsProductLadderController implements IBaseController<PmsProductLadderService, PmsProductLadder> {

    private final PmsProductLadderService pmsProductLadderService;

    @Override
    public PmsProductLadderService getService() {
        return pmsProductLadderService;
    }

}
