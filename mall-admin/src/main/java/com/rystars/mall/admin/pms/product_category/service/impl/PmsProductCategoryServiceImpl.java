package com.rystars.mall.admin.pms.product_category.service.impl;

import com.rystars.mall.admin.pms.product_category.bean.PmsProductCategory;
import com.rystars.mall.admin.pms.product_category.mapper.PmsProductCategoryMapper;
import com.rystars.mall.admin.pms.product_category.service.PmsProductCategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author rystars
 * @date 2023/4/6
 */

@Service
public class PmsProductCategoryServiceImpl implements PmsProductCategoryService {

    private final PmsProductCategoryMapper pmsProductCategoryMapper;

    public PmsProductCategoryServiceImpl(PmsProductCategoryMapper pmsProductCategoryMapper) {
        this.pmsProductCategoryMapper = pmsProductCategoryMapper;
    }


    @Override
    public List<PmsProductCategory> selectAll() {
        return pmsProductCategoryMapper.selectAll();
    }

    @Override
    public Long insert(PmsProductCategory pmsProductCategory) {
        return pmsProductCategoryMapper.insert(pmsProductCategory);
    }

    @Override
    public Long updateById(String id, PmsProductCategory pmsProductCategory) {
        return pmsProductCategoryMapper.updateById(id, pmsProductCategory);
    }

    @Override
    public Long deleteById(String id) {
        return pmsProductCategoryMapper.deleteById(id);
    }

}
