package com.rystars.mall.admin.pms.comment.service.impl;

import com.rystars.mall.admin.pms.comment.bean.PmsCommentReplay;
import com.rystars.mall.admin.pms.comment.service.PmsCommentReplayService;
import com.rystars.mall.admin.pms.comment.mapper.PmsCommentReplayMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【pms_comment_replay(产品评价回复表)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:50:29
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class PmsCommentReplayServiceImpl extends IBaseServiceImpl<PmsCommentReplayMapper, PmsCommentReplay> implements PmsCommentReplayService{

    private final PmsCommentReplayMapper pmsCommentReplayMapper;

}




