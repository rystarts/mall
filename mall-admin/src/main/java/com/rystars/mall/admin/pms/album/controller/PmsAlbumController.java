package com.rystars.mall.admin.pms.album.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import com.rystars.mall.admin.pms.album.bean.PmsAlbum;
import com.rystars.mall.admin.pms.album.service.PmsAlbumService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【pms_album(相册表)】Controller
 *
 * @author rystars
 * @date 2023-04-13 10:49:58
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/album")
@Tag(name = "PmsAlbumController", description = "相册表")
public class PmsAlbumController {

    private final PmsAlbumService pmsAlbumService;

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<PmsAlbum> save(@Parameter(name = "相册表", required = true)
                                 @RequestBody PmsAlbum pmsAlbum) {
        return Result.instance(pmsAlbumService.save(pmsAlbum));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<PmsAlbum> update(@Parameter(name = "主键", required = true)
                                   @PathVariable(value = "id") String id,
                                   @RequestBody PmsAlbum pmsAlbum) {
        boolean result = pmsAlbumService.update(pmsAlbum, new UpdateWrapper<PmsAlbum>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<PmsAlbum> delete(@Parameter(name = "主键", required = true)
                                   @PathVariable(value = "id") String id) {
        return Result.instance(pmsAlbumService.removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<PmsAlbum> queryById(@Parameter(name = "主键", required = true)
                                      @PathVariable(value = "id") String id) {
        return Result.success(pmsAlbumService.getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<PmsAlbum>> queryAll() {
        return Result.success(pmsAlbumService.list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<PmsAlbum>> queryPage(@RequestBody PageParam page) {
        return Result.success(pmsAlbumService.queryPage(page, null));
    }

}
