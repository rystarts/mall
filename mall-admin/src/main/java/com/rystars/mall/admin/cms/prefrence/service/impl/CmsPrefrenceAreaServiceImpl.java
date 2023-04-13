package com.rystars.mall.admin.cms.prefrence.service.impl;

import com.rystars.mall.admin.cms.prefrence.bean.CmsPrefrenceArea;
import com.rystars.mall.admin.cms.prefrence.mapper.CmsPrefrenceAreaMapper;
import com.rystars.mall.admin.cms.prefrence.service.CmsPrefrenceAreaService;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【cms_prefrence_area(优选专区)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-13 10:38:54
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class CmsPrefrenceAreaServiceImpl extends IBaseServiceImpl<CmsPrefrenceAreaMapper, CmsPrefrenceArea> implements CmsPrefrenceAreaService {

    private final CmsPrefrenceAreaMapper cmsPrefrenceAreaMapper;

}




