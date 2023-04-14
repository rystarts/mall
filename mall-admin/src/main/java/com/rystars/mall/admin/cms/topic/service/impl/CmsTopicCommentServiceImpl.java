package com.rystars.mall.admin.cms.topic.service.impl;

import com.rystars.mall.admin.cms.topic.bean.CmsTopicComment;
import com.rystars.mall.admin.cms.topic.mapper.CmsTopicCommentMapper;
import com.rystars.mall.admin.cms.topic.service.CmsTopicCommentService;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【cms_topic_comment(专题评论表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:10:10
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class CmsTopicCommentServiceImpl extends IBaseServiceImpl<CmsTopicCommentMapper, CmsTopicComment> implements CmsTopicCommentService {

    private final CmsTopicCommentMapper cmsTopicCommentMapper;

}




