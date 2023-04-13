package com.rystars.mall.admin.cms.subject.service.impl;

import com.rystars.mall.admin.cms.subject.bean.CmsSubjectProductRelation;
import com.rystars.mall.admin.cms.subject.service.CmsSubjectProductRelationService;
import com.rystars.mall.admin.cms.subject.mapper.CmsSubjectProductRelationMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【cms_subject_product_relation(专题商品关系表)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:39:09
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class CmsSubjectProductRelationServiceImpl extends IBaseServiceImpl<CmsSubjectProductRelationMapper, CmsSubjectProductRelation> implements CmsSubjectProductRelationService{

    private final CmsSubjectProductRelationMapper cmsSubjectProductRelationMapper;

}




