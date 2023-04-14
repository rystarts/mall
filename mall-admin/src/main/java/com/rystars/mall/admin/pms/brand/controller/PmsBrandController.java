package com.rystars.mall.admin.pms.brand.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.pms.brand.bean.PmsBrand;
import com.rystars.mall.admin.pms.brand.service.PmsBrandService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【pms_brand(品牌表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:10:58
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/brand")
@Tag(name = "PmsBrandController", description = "品牌表")
public class PmsBrandController implements IBaseController<PmsBrandService, PmsBrand> {

    private final PmsBrandService pmsBrandService;

    @Override
    public PmsBrandService getService() {
        return pmsBrandService;
    }

}
