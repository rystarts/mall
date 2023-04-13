package com.rystars.mall.admin.pms.member.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.pms.member.bean.PmsMemberPrice;
import com.rystars.mall.admin.pms.member.service.PmsMemberPriceService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【pms_member_price(商品会员价格表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:50:44
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/member/price")
@Tag(name = "PmsMemberPriceController", description = "商品会员价格表")
public class PmsMemberPriceController {

    private final PmsMemberPriceService pmsMemberPriceService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<PmsMemberPrice> save(@Parameter(name = "商品会员价格表", required = true)
                                       @RequestBody PmsMemberPrice pmsMemberPrice) {
        return Result.instance(pmsMemberPriceService.save(pmsMemberPrice));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<PmsMemberPrice> update(@Parameter(name = "主键", required = true)
                                         @PathVariable(value = "id") String id,
                                         @RequestBody PmsMemberPrice pmsMemberPrice) {
        boolean result = pmsMemberPriceService.update(pmsMemberPrice, new UpdateWrapper<PmsMemberPrice>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<PmsMemberPrice> delete(@Parameter(name = "主键", required = true)
                                         @PathVariable(value = "id") String id) {
        return Result.instance(pmsMemberPriceService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<PmsMemberPrice> queryById(@Parameter(name = "主键", required = true)
                                            @PathVariable(value = "id") String id) {
        return Result.success(pmsMemberPriceService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<PmsMemberPrice>> queryAll() {
        return Result.success(pmsMemberPriceService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<PmsMemberPrice>> queryPage(@RequestBody PageParam page) {
        return Result.success(pmsMemberPriceService.queryPage(page, null));
    }

}
