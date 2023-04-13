package com.rystars.mall.admin.cms.subject.service.impl;

import com.rystars.mall.admin.cms.subject.bean.CmsSubject;
import com.rystars.mall.admin.cms.subject.mapper.CmsSubjectMapper;
import com.rystars.mall.admin.cms.subject.service.CmsSubjectService;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【cms_subject(专题表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-13 10:39:09
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class CmsSubjectServiceImpl extends IBaseServiceImpl<CmsSubjectMapper, CmsSubject> implements CmsSubjectService {

    private final CmsSubjectMapper cmsSubjectMapper;

}




