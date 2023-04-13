package com.rystars.mall.admin.ums.member.controller;

import com.rystars.mall.admin.ums.member.bean.UmsMemberProductCategoryRelation;
import com.rystars.mall.admin.ums.member.service.UmsMemberProductCategoryRelationService;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 【ums_member_product_category_relation(会员与产品分类关系表（用户喜欢的分类）)】Controller
 * @author rystars
 * @date 2023-04-13 10:58:51
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/member/product/category/relation")
@Tag(name = "UmsMemberProductCategoryRelationController", description = "会员与产品分类关系表（用户喜欢的分类）")
public class UmsMemberProductCategoryRelationController {

    private final UmsMemberProductCategoryRelationService umsMemberProductCategoryRelationService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<UmsMemberProductCategoryRelation> save(@Parameter(name = "会员与产品分类关系表（用户喜欢的分类）", required = true)
                                                     @RequestBody UmsMemberProductCategoryRelation umsMemberProductCategoryRelation) {
        return Result.instance(umsMemberProductCategoryRelationService.save(umsMemberProductCategoryRelation));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<UmsMemberProductCategoryRelation> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody UmsMemberProductCategoryRelation umsMemberProductCategoryRelation) {
        boolean result = umsMemberProductCategoryRelationService.update(umsMemberProductCategoryRelation, new UpdateWrapper<UmsMemberProductCategoryRelation>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<UmsMemberProductCategoryRelation> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(umsMemberProductCategoryRelationService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<UmsMemberProductCategoryRelation> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(umsMemberProductCategoryRelationService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<UmsMemberProductCategoryRelation>> queryAll() {
        return Result.success(umsMemberProductCategoryRelationService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<UmsMemberProductCategoryRelation>> queryPage(@RequestBody PageParam page) {
        return Result.success(umsMemberProductCategoryRelationService.queryPage(page, null));
    }

}
