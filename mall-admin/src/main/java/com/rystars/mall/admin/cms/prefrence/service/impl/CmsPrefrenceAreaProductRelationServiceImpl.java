package com.rystars.mall.admin.cms.prefrence.service.impl;

import com.rystars.mall.admin.cms.prefrence.bean.CmsPrefrenceAreaProductRelation;
import com.rystars.mall.admin.cms.prefrence.service.CmsPrefrenceAreaProductRelationService;
import com.rystars.mall.admin.cms.prefrence.mapper.CmsPrefrenceAreaProductRelationMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【cms_prefrence_area_product_relation(优选专区和产品关系表)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:38:54
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class CmsPrefrenceAreaProductRelationServiceImpl extends IBaseServiceImpl<CmsPrefrenceAreaProductRelationMapper, CmsPrefrenceAreaProductRelation> implements CmsPrefrenceAreaProductRelationService{

    private final CmsPrefrenceAreaProductRelationMapper cmsPrefrenceAreaProductRelationMapper;

}




