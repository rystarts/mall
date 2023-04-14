package com.rystars.mall.admin.pms.feight.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.pms.feight.bean.PmsFeightTemplate;
import com.rystars.mall.admin.pms.feight.service.PmsFeightTemplateService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【pms_feight_template(运费模版)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:11:14
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/feight/template")
@Tag(name = "PmsFeightTemplateController", description = "运费模版")
public class PmsFeightTemplateController implements IBaseController<PmsFeightTemplateService, PmsFeightTemplate> {

    private final PmsFeightTemplateService pmsFeightTemplateService;

    @Override
    public PmsFeightTemplateService getService() {
        return pmsFeightTemplateService;
    }

}
