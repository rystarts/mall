package com.rystars.mall.admin.ums.resource.service.impl;

import com.rystars.mall.admin.ums.resource.bean.UmsResourceCategory;
import com.rystars.mall.admin.ums.resource.service.UmsResourceCategoryService;
import com.rystars.mall.admin.ums.resource.mapper.UmsResourceCategoryMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【ums_resource_category(资源分类表)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:59:24
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UmsResourceCategoryServiceImpl extends IBaseServiceImpl<UmsResourceCategoryMapper, UmsResourceCategory> implements UmsResourceCategoryService{

    private final UmsResourceCategoryMapper umsResourceCategoryMapper;

}




