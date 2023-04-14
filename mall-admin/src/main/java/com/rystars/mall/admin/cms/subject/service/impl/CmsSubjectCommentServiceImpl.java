package com.rystars.mall.admin.cms.subject.service.impl;

import com.rystars.mall.admin.cms.subject.bean.CmsSubjectComment;
import com.rystars.mall.admin.cms.subject.mapper.CmsSubjectCommentMapper;
import com.rystars.mall.admin.cms.subject.service.CmsSubjectCommentService;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【cms_subject_comment(专题评论表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:10:02
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class CmsSubjectCommentServiceImpl extends IBaseServiceImpl<CmsSubjectCommentMapper, CmsSubjectComment> implements CmsSubjectCommentService {

    private final CmsSubjectCommentMapper cmsSubjectCommentMapper;

}




