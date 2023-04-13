package com.rystars.mall.admin.ums.member.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.ums.member.bean.UmsMemberReceiveAddress;
import com.rystars.mall.admin.ums.member.service.UmsMemberReceiveAddressService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【ums_member_receive_address(会员收货地址表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:58:51
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/member/receive/address")
@Tag(name = "UmsMemberReceiveAddressController", description = "会员收货地址表")
public class UmsMemberReceiveAddressController {

    private final UmsMemberReceiveAddressService umsMemberReceiveAddressService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<UmsMemberReceiveAddress> save(@Parameter(name = "会员收货地址表", required = true)
                                                @RequestBody UmsMemberReceiveAddress umsMemberReceiveAddress) {
        return Result.instance(umsMemberReceiveAddressService.save(umsMemberReceiveAddress));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<UmsMemberReceiveAddress> update(@Parameter(name = "主键", required = true)
                                                  @PathVariable(value = "id") String id,
                                                  @RequestBody UmsMemberReceiveAddress umsMemberReceiveAddress) {
        boolean result = umsMemberReceiveAddressService.update(umsMemberReceiveAddress, new UpdateWrapper<UmsMemberReceiveAddress>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<UmsMemberReceiveAddress> delete(@Parameter(name = "主键", required = true)
                                                  @PathVariable(value = "id") String id) {
        return Result.instance(umsMemberReceiveAddressService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<UmsMemberReceiveAddress> queryById(@Parameter(name = "主键", required = true)
                                                     @PathVariable(value = "id") String id) {
        return Result.success(umsMemberReceiveAddressService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<UmsMemberReceiveAddress>> queryAll() {
        return Result.success(umsMemberReceiveAddressService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<UmsMemberReceiveAddress>> queryPage(@RequestBody PageParam page) {
        return Result.success(umsMemberReceiveAddressService.queryPage(page, null));
    }

}
