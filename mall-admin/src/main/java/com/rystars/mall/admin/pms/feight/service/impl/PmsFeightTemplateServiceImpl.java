package com.rystars.mall.admin.pms.feight.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.pms.feight.bean.PmsFeightTemplate;
import com.rystars.mall.admin.pms.feight.mapper.PmsFeightTemplateMapper;
import com.rystars.mall.admin.pms.feight.service.PmsFeightTemplateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【pms_feight_template(运费模版)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-13 10:50:37
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class PmsFeightTemplateServiceImpl extends IBaseServiceImpl<PmsFeightTemplateMapper, PmsFeightTemplate> implements PmsFeightTemplateService {

    private final PmsFeightTemplateMapper pmsFeightTemplateMapper;

}




