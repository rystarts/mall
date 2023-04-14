package com.rystars.mall.admin.cms.prefrence.controller;

import com.rystars.mall.admin.cms.prefrence.bean.CmsPrefrenceArea;
import com.rystars.mall.admin.cms.prefrence.service.CmsPrefrenceAreaService;
import com.rystars.mall.admin.frame.base.controller.IBaseController;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【cms_prefrence_area(优选专区)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:09:53
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cms/prefrence/area")
@Tag(name = "CmsPrefrenceAreaController", description = "优选专区")
public class CmsPrefrenceAreaController implements IBaseController<CmsPrefrenceAreaService, CmsPrefrenceArea> {

    private final CmsPrefrenceAreaService cmsPrefrenceAreaService;

    @Override
    public CmsPrefrenceAreaService getService() {
        return cmsPrefrenceAreaService;
    }

}
