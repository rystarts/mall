package com.rystars.mall.admin.cms.prefrence.controller;

import com.rystars.mall.admin.cms.prefrence.bean.CmsPrefrenceAreaProductRelation;
import com.rystars.mall.admin.cms.prefrence.service.CmsPrefrenceAreaProductRelationService;
import com.rystars.mall.admin.frame.base.controller.IBaseController;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【cms_prefrence_area_product_relation(优选专区和产品关系表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:09:53
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cms/prefrence/area/product/relation")
@Tag(name = "CmsPrefrenceAreaProductRelationController", description = "优选专区和产品关系表")
public class CmsPrefrenceAreaProductRelationController implements IBaseController<CmsPrefrenceAreaProductRelationService, CmsPrefrenceAreaProductRelation> {

    private final CmsPrefrenceAreaProductRelationService cmsPrefrenceAreaProductRelationService;

    @Override
    public CmsPrefrenceAreaProductRelationService getService() {
        return cmsPrefrenceAreaProductRelationService;
    }

}
