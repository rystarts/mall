package com.rystars.mall.admin.cms.help.service.impl;

import com.rystars.mall.admin.cms.help.bean.CmsHelpCategory;
import com.rystars.mall.admin.cms.help.service.CmsHelpCategoryService;
import com.rystars.mall.admin.cms.help.mapper.CmsHelpCategoryMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【cms_help_category(帮助分类表)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:38:18
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class CmsHelpCategoryServiceImpl extends IBaseServiceImpl<CmsHelpCategoryMapper, CmsHelpCategory> implements CmsHelpCategoryService{

    private final CmsHelpCategoryMapper cmsHelpCategoryMapper;

}




