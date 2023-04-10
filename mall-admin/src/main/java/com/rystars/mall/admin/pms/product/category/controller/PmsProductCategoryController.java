package com.rystars.mall.admin.pms.product.category.controller;

import com.github.pagehelper.PageInfo;
import com.rystars.mall.admin.pms.product.category.bean.PmsProductCategory;
import com.rystars.mall.admin.pms.product.category.service.PmsProductCategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author rystars
 * @date 2023/4/6
 * Tag 配置模块名
 * ApiResponses 配置接口响应 可以用ApiResponse单独配置
 * Operation 配置接口名称和描述 summary-接口名 description-接口描述
 * Parameters 配置参数信息 可以用 Parameter 单独配置
 * 文件类型的需要指明 接口消费的是文件 consumes = MediaType.MULTIPART_FORM_DATA_VALUE
 * ApiIgnore 忽略
 */

@RestController
@RequestMapping("/pms/product-category")
@Tag(name = "PmsProductCategoryController", description = "产品分类 API")
@ApiResponses(@ApiResponse(responseCode = "200", description = "success"))
public class PmsProductCategoryController {

    private final PmsProductCategoryService pmsProductCategoryService;

    public PmsProductCategoryController(PmsProductCategoryService pmsProductCategoryService) {
        this.pmsProductCategoryService = pmsProductCategoryService;
    }

    @PostMapping("/query/raws")
    @Operation(summary = "分页查询", description = "分页查询产品分类信息")
    @Parameters(@Parameter(required = true))
    public PageInfo<PmsProductCategory> selectPageInfo(int pageNum, int pageSize) {
        return pmsProductCategoryService.selectPageInfo(pageNum, pageSize);
    }


    @PostMapping("/query")
    @Operation(summary = "查询所有")
    public List<PmsProductCategory> selectAll() {
        return pmsProductCategoryService.selectAll();
    }

    @PostMapping
    @Operation(summary = "新增")
    public Long insert(@Parameter(name = "新增的产品分类信息", required = true) @RequestBody PmsProductCategory pmsProductCategory) {
        return pmsProductCategoryService.insert(pmsProductCategory);
    }

    @PutMapping("/{id}")
    @Operation(summary = "根据ID更新")
    public Long updateById(@Parameter(name = "id", required = true) @PathVariable String id, @RequestBody PmsProductCategory pmsProductCategory) {
        return pmsProductCategoryService.updateById(id, pmsProductCategory);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "根据ID删除")
    public Long deleteById(@Parameter(name = "id", required = true) @PathVariable String id) {
        return pmsProductCategoryService.deleteById(id);
    }

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @Operation(summary = "上传文件")
    public void uploadFile(MultipartFile file) {
        // 上传文件 ---
        String name = file.getName();
        System.out.println(name);
    }

}
