package com.rystars.mall.admin.pms.product_category.controller;

import com.rystars.mall.admin.pms.product_category.bean.PmsProductCategory;
import com.rystars.mall.admin.pms.product_category.service.PmsProductCategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author rystars
 * @date 2023/4/6
 */

@RestController
@RequestMapping("/pms/product-category")
public class PmsProductCategoryController {

    private final PmsProductCategoryService pmsProductCategoryService;

    public PmsProductCategoryController(PmsProductCategoryService pmsProductCategoryService) {
        this.pmsProductCategoryService = pmsProductCategoryService;
    }

    @PostMapping("/query")
    public List<PmsProductCategory> selectAll() {
        return pmsProductCategoryService.selectAll();
    }

    @PostMapping
    public Long insert(@RequestBody PmsProductCategory pmsProductCategory) {
        return pmsProductCategoryService.insert(pmsProductCategory);
    }

    @PutMapping("/{id}")
    public Long updateById(@PathVariable String id, @RequestBody PmsProductCategory pmsProductCategory) {
        return pmsProductCategoryService.updateById(id, pmsProductCategory);
    }

    @DeleteMapping("/{id}")
    public Long deleteById(@PathVariable String id) {
        return pmsProductCategoryService.deleteById(id);
    }

}
