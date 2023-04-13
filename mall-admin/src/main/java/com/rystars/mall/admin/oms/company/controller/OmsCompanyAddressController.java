package com.rystars.mall.admin.oms.company.controller;

import com.rystars.mall.admin.oms.company.bean.OmsCompanyAddress;
import com.rystars.mall.admin.oms.company.service.OmsCompanyAddressService;
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
 * 【oms_company_address(公司收发货地址表)】Controller
 * @author rystars
 * @date 2023-04-13 10:43:28
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/oms/company/address")
@Tag(name = "OmsCompanyAddressController", description = "公司收发货地址表")
public class OmsCompanyAddressController {

    private final OmsCompanyAddressService omsCompanyAddressService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<OmsCompanyAddress> save(@Parameter(name = "公司收发货地址表", required = true)
                                                     @RequestBody OmsCompanyAddress omsCompanyAddress) {
        return Result.instance(omsCompanyAddressService.save(omsCompanyAddress));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<OmsCompanyAddress> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody OmsCompanyAddress omsCompanyAddress) {
        boolean result = omsCompanyAddressService.update(omsCompanyAddress, new UpdateWrapper<OmsCompanyAddress>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<OmsCompanyAddress> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(omsCompanyAddressService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<OmsCompanyAddress> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(omsCompanyAddressService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<OmsCompanyAddress>> queryAll() {
        return Result.success(omsCompanyAddressService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<OmsCompanyAddress>> queryPage(@RequestBody PageParam page) {
        return Result.success(omsCompanyAddressService.queryPage(page, null));
    }

}
