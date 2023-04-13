package com.rystars.mall.admin.pms.album.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.pms.album.bean.PmsAlbumPic;
import com.rystars.mall.admin.pms.album.mapper.PmsAlbumPicMapper;
import com.rystars.mall.admin.pms.album.service.PmsAlbumPicService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【pms_album_pic(画册图片表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-13 10:50:09
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class PmsAlbumPicServiceImpl extends IBaseServiceImpl<PmsAlbumPicMapper, PmsAlbumPic> implements PmsAlbumPicService {

    private final PmsAlbumPicMapper pmsAlbumPicMapper;

}




