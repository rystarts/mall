package com.rystars.mall.admin.pms.album.controller;

import com.rystars.mall.admin.pms.album.bean.PmsAlbumPic;
import com.rystars.mall.admin.pms.album.service.PmsAlbumPicService;
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
 * 【pms_album_pic(画册图片表)】Controller
 * @author rystars
 * @date 2023-04-13 10:50:09
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/album/pic")
@Tag(name = "PmsAlbumPicController", description = "画册图片表")
public class PmsAlbumPicController {

    private final PmsAlbumPicService pmsAlbumPicService;
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<PmsAlbumPic> save(@Parameter(name = "画册图片表", required = true)
                                                     @RequestBody PmsAlbumPic pmsAlbumPic) {
        return Result.instance(pmsAlbumPicService.save(pmsAlbumPic));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<PmsAlbumPic> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody PmsAlbumPic pmsAlbumPic) {
        boolean result = pmsAlbumPicService.update(pmsAlbumPic, new UpdateWrapper<PmsAlbumPic>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<PmsAlbumPic> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(pmsAlbumPicService.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<PmsAlbumPic> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(pmsAlbumPicService.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<PmsAlbumPic>> queryAll() {
        return Result.success(pmsAlbumPicService.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<PmsAlbumPic>> queryPage(@RequestBody PageParam page) {
        return Result.success(pmsAlbumPicService.queryPage(page, null));
    }

}
