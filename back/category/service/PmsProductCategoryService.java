package com.rystars.mall.admin.pms.product.category.service;

import com.rystars.mall.admin.pms.product.category.bean.PmsProductCategory;

import java.util.List;

/**
 * @author rystars
 * @date 2023-04-06
 */
public interface PmsProductCategoryService {

    /**
     * 查询所有数据
     * @return 全表查询
     */
    List<PmsProductCategory> selectAll();

    /**
     * 新增
     * @param pmsProductCategory 要新增的PmsProductCategory
     * @return 新增数据ID
     */
    Long insert(PmsProductCategory pmsProductCategory);

    /**
     * 根据id更新
     * @param id 更新数据的ID
     * @param pmsProductCategory 要更新的PmsProductCategory
     * @return 更新数据的ID
     */
    Long updateById(String id, PmsProductCategory pmsProductCategory);

    /**
     * 根据id删除
     * @param id 删除数据的ID
     * @return 删除数据的ID
     */
    Long deleteById(String id);

}
