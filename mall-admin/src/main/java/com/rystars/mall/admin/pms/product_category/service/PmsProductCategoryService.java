package com.rystars.mall.admin.pms.product_category.service;

import com.rystars.mall.admin.pms.product_category.bean.PmsProductCategory;

import java.util.List;

public interface PmsProductCategoryService {

    List<PmsProductCategory> selectAll();

    Long insert(PmsProductCategory pmsProductCategory);

    Long updateById(String id, PmsProductCategory pmsProductCategory);

    Long deleteById(String id);

}
