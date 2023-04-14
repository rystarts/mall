package com.rystars.mall.admin.cms.subject.controller;

import com.rystars.mall.admin.cms.subject.bean.CmsSubject;
import com.rystars.mall.admin.cms.subject.service.CmsSubjectService;
import com.rystars.mall.admin.frame.base.controller.IBaseController;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【cms_subject(专题表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:10:02
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cms/subject")
@Tag(name = "CmsSubjectController", description = "专题表")
public class CmsSubjectController implements IBaseController<CmsSubjectService, CmsSubject> {

    private final CmsSubjectService cmsSubjectService;

    @Override
    public CmsSubjectService getService() {
        return cmsSubjectService;
    }

}
