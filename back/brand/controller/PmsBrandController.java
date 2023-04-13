package com.rystars.mall.admin.pms.brand.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.pms.brand.bean.PmsBrand;
import com.rystars.mall.admin.pms.brand.service.PmsBrandService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品品牌 Controller
 *
 * @author rystars
 * @since 2023/4/12
 **/
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/brand")
@Tag(name = "PmsProductCategoryController", description = "商品品牌 API")
public class PmsBrandController {

    private final PmsBrandService pmsBrandService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<PmsBrand> save(@Parameter(name = "商品品牌", required = true)
                                 @RequestBody PmsBrand pmsBrand) {
        return Result.instance(pmsBrandService.save(pmsBrand));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<PmsBrand> update(@Parameter(name = "主键", required = true)
                                   @PathVariable(value = "id") String id,
                                   @RequestBody PmsBrand pmsBrand) {
        boolean result = pmsBrandService.update(pmsBrand, new UpdateWrapper<PmsBrand>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<PmsBrand> delete(@Parameter(name = "主键", required = true)
                                   @PathVariable(value = "id") String id) {
        return Result.instance(pmsBrandService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<PmsBrand> queryById(@Parameter(name = "主键", required = true)
                                      @PathVariable(value = "id") String id) {
        return Result.success(pmsBrandService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<PmsBrand>> queryAll() {
        return Result.success(pmsBrandService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<PmsBrand>> queryPage(@RequestBody PageParam page) {
        return Result.success(pmsBrandService.queryPage(page, null));
    }

}
