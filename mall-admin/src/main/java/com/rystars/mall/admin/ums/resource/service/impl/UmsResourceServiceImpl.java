package com.rystars.mall.admin.ums.resource.service.impl;

import com.rystars.mall.admin.ums.resource.bean.UmsResource;
import com.rystars.mall.admin.ums.resource.service.UmsResourceService;
import com.rystars.mall.admin.ums.resource.mapper.UmsResourceMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【ums_resource(后台资源表)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:59:24
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UmsResourceServiceImpl extends IBaseServiceImpl<UmsResourceMapper, UmsResource> implements UmsResourceService{

    private final UmsResourceMapper umsResourceMapper;

}




