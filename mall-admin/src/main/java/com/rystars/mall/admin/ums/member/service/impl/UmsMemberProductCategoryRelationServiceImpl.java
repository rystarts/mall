package com.rystars.mall.admin.ums.member.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.ums.member.bean.UmsMemberProductCategoryRelation;
import com.rystars.mall.admin.ums.member.mapper.UmsMemberProductCategoryRelationMapper;
import com.rystars.mall.admin.ums.member.service.UmsMemberProductCategoryRelationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【ums_member_product_category_relation(会员与产品分类关系表（用户喜欢的分类）)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-13 10:58:51
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UmsMemberProductCategoryRelationServiceImpl extends IBaseServiceImpl<UmsMemberProductCategoryRelationMapper, UmsMemberProductCategoryRelation> implements UmsMemberProductCategoryRelationService {

    private final UmsMemberProductCategoryRelationMapper umsMemberProductCategoryRelationMapper;

}




