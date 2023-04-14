package com.rystars.mall.admin.cms.subject.controller;

import com.rystars.mall.admin.cms.subject.bean.CmsSubjectProductRelation;
import com.rystars.mall.admin.cms.subject.service.CmsSubjectProductRelationService;
import com.rystars.mall.admin.frame.base.controller.IBaseController;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【cms_subject_product_relation(专题商品关系表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:10:02
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cms/subject/product/relation")
@Tag(name = "CmsSubjectProductRelationController", description = "专题商品关系表")
public class CmsSubjectProductRelationController implements IBaseController<CmsSubjectProductRelationService, CmsSubjectProductRelation> {

    private final CmsSubjectProductRelationService cmsSubjectProductRelationService;

    @Override
    public CmsSubjectProductRelationService getService() {
        return cmsSubjectProductRelationService;
    }

}
