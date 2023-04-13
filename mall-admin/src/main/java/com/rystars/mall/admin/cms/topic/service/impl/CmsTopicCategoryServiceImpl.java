package com.rystars.mall.admin.cms.topic.service.impl;

import com.rystars.mall.admin.cms.topic.bean.CmsTopicCategory;
import com.rystars.mall.admin.cms.topic.service.CmsTopicCategoryService;
import com.rystars.mall.admin.cms.topic.mapper.CmsTopicCategoryMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【cms_topic_category(话题分类表)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:39:19
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class CmsTopicCategoryServiceImpl extends IBaseServiceImpl<CmsTopicCategoryMapper, CmsTopicCategory> implements CmsTopicCategoryService{

    private final CmsTopicCategoryMapper cmsTopicCategoryMapper;

}




