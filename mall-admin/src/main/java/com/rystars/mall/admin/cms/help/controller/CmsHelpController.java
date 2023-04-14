package com.rystars.mall.admin.cms.help.controller;

import com.rystars.mall.admin.cms.help.bean.CmsHelp;
import com.rystars.mall.admin.cms.help.service.CmsHelpService;
import com.rystars.mall.admin.frame.base.controller.IBaseController;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【cms_help(帮助表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:09:30
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cms/help")
@Tag(name = "CmsHelpController", description = "帮助表")
public class CmsHelpController implements IBaseController<CmsHelpService, CmsHelp> {

    private final CmsHelpService cmsHelpService;

    @Override
    public CmsHelpService getService() {
        return cmsHelpService;
    }

}
