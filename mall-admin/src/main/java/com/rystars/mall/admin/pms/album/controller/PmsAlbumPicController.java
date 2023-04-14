package com.rystars.mall.admin.pms.album.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.pms.album.bean.PmsAlbumPic;
import com.rystars.mall.admin.pms.album.service.PmsAlbumPicService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【pms_album_pic(画册图片表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:10:51
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/album/pic")
@Tag(name = "PmsAlbumPicController", description = "画册图片表")
public class PmsAlbumPicController implements IBaseController<PmsAlbumPicService, PmsAlbumPic> {

    private final PmsAlbumPicService pmsAlbumPicService;

    @Override
    public PmsAlbumPicService getService() {
        return pmsAlbumPicService;
    }

}
