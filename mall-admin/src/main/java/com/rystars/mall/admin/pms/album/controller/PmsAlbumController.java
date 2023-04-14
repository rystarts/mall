package com.rystars.mall.admin.pms.album.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.pms.album.bean.PmsAlbum;
import com.rystars.mall.admin.pms.album.service.PmsAlbumService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【pms_album(相册表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:10:51
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/pms/album")
@Tag(name = "PmsAlbumController", description = "相册表")
public class PmsAlbumController implements IBaseController<PmsAlbumService, PmsAlbum> {

    private final PmsAlbumService pmsAlbumService;

    @Override
    public PmsAlbumService getService() {
        return pmsAlbumService;
    }

}
