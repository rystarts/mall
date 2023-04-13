package com.rystars.mall.admin.ums.menu.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.ums.menu.bean.UmsMenu;
import com.rystars.mall.admin.ums.menu.mapper.UmsMenuMapper;
import com.rystars.mall.admin.ums.menu.service.UmsMenuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【ums_menu(后台菜单表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-13 10:59:04
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UmsMenuServiceImpl extends IBaseServiceImpl<UmsMenuMapper, UmsMenu> implements UmsMenuService {

    private final UmsMenuMapper umsMenuMapper;

}




