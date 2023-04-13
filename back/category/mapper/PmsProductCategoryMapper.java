package com.rystars.mall.admin.pms.product.category.mapper;

import com.rystars.mall.admin.pms.product.category.bean.PmsProductCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PmsProductCategoryMapper {

    List<PmsProductCategory> selectAll();

    Long insert(PmsProductCategory pmsProductCategory);

    Long updateById(@Param("id") String id, @Param("pmsProductCategory") PmsProductCategory pmsProductCategory);

    Long deleteById(String id);

}
