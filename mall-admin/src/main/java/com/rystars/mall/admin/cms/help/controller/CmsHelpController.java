package com.rystars.mall.admin.cms.help.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.cms.help.bean.CmsHelp;
import com.rystars.mall.admin.cms.help.service.CmsHelpService;
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
 * 【cms_help(帮助表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:38:18
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cms/help")
@Tag(name = "CmsHelpController", description = "帮助表")
public class CmsHelpController {

    private final CmsHelpService cmsHelpService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<CmsHelp> save(@Parameter(name = "帮助表", required = true)
                                @RequestBody CmsHelp cmsHelp) {
        return Result.instance(cmsHelpService.save(cmsHelp));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<CmsHelp> update(@Parameter(name = "主键", required = true)
                                  @PathVariable(value = "id") String id,
                                  @RequestBody CmsHelp cmsHelp) {
        boolean result = cmsHelpService.update(cmsHelp, new UpdateWrapper<CmsHelp>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<CmsHelp> delete(@Parameter(name = "主键", required = true)
                                  @PathVariable(value = "id") String id) {
        return Result.instance(cmsHelpService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<CmsHelp> queryById(@Parameter(name = "主键", required = true)
                                     @PathVariable(value = "id") String id) {
        return Result.success(cmsHelpService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<CmsHelp>> queryAll() {
        return Result.success(cmsHelpService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<CmsHelp>> queryPage(@RequestBody PageParam page) {
        return Result.success(cmsHelpService.queryPage(page, null));
    }

}
