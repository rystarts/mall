package com.rystars.mall.admin.ums.member.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.ums.member.bean.UmsMemberProductCategoryRelation;
import com.rystars.mall.admin.ums.member.service.UmsMemberProductCategoryRelationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【ums_member_product_category_relation(会员与产品分类关系表（用户喜欢的分类）)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:12:53
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/member/product/category/relation")
@Tag(name = "UmsMemberProductCategoryRelationController", description = "会员与产品分类关系表（用户喜欢的分类）")
public class UmsMemberProductCategoryRelationController implements IBaseController<UmsMemberProductCategoryRelationService, UmsMemberProductCategoryRelation> {

    private final UmsMemberProductCategoryRelationService umsMemberProductCategoryRelationService;

    @Override
    public UmsMemberProductCategoryRelationService getService() {
        return umsMemberProductCategoryRelationService;
    }

}
