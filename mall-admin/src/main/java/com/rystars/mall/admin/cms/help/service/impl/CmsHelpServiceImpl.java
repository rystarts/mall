package com.rystars.mall.admin.cms.help.service.impl;

import com.rystars.mall.admin.cms.help.bean.CmsHelp;
import com.rystars.mall.admin.cms.help.mapper.CmsHelpMapper;
import com.rystars.mall.admin.cms.help.service.CmsHelpService;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【cms_help(帮助表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:09:30
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class CmsHelpServiceImpl extends IBaseServiceImpl<CmsHelpMapper, CmsHelp> implements CmsHelpService {

    private final CmsHelpMapper cmsHelpMapper;

}




