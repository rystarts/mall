package com.rystars.mall.admin.pms.comment.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.pms.comment.bean.PmsComment;
import com.rystars.mall.admin.pms.comment.mapper.PmsCommentMapper;
import com.rystars.mall.admin.pms.comment.service.PmsCommentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【pms_comment(商品评价表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:11:05
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class PmsCommentServiceImpl extends IBaseServiceImpl<PmsCommentMapper, PmsComment> implements PmsCommentService {

    private final PmsCommentMapper pmsCommentMapper;

}




