package com.rystars.mall.admin.pms.album.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.pms.album.bean.PmsAlbum;
import com.rystars.mall.admin.pms.album.mapper.PmsAlbumMapper;
import com.rystars.mall.admin.pms.album.service.PmsAlbumService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【pms_album(相册表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-13 10:49:58
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class PmsAlbumServiceImpl extends IBaseServiceImpl<PmsAlbumMapper, PmsAlbum> implements PmsAlbumService {

    private final PmsAlbumMapper pmsAlbumMapper;

}




