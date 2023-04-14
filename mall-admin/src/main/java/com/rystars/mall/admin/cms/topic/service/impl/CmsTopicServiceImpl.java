package com.rystars.mall.admin.cms.topic.service.impl;

import com.rystars.mall.admin.cms.topic.bean.CmsTopic;
import com.rystars.mall.admin.cms.topic.mapper.CmsTopicMapper;
import com.rystars.mall.admin.cms.topic.service.CmsTopicService;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【cms_topic(话题表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:10:10
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class CmsTopicServiceImpl extends IBaseServiceImpl<CmsTopicMapper, CmsTopic> implements CmsTopicService {

    private final CmsTopicMapper cmsTopicMapper;

}




