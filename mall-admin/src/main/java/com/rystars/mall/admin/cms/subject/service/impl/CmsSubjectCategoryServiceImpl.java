package com.rystars.mall.admin.cms.subject.service.impl;

import com.rystars.mall.admin.cms.subject.bean.CmsSubjectCategory;
import com.rystars.mall.admin.cms.subject.mapper.CmsSubjectCategoryMapper;
import com.rystars.mall.admin.cms.subject.service.CmsSubjectCategoryService;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【cms_subject_category(专题分类表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:10:02
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class CmsSubjectCategoryServiceImpl extends IBaseServiceImpl<CmsSubjectCategoryMapper, CmsSubjectCategory> implements CmsSubjectCategoryService {

    private final CmsSubjectCategoryMapper cmsSubjectCategoryMapper;

}




