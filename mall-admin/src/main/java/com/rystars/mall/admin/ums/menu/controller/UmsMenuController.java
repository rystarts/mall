package com.rystars.mall.admin.ums.menu.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.ums.menu.bean.UmsMenu;
import com.rystars.mall.admin.ums.menu.service.UmsMenuService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【ums_menu(后台菜单表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:13:01
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/menu")
@Tag(name = "UmsMenuController", description = "后台菜单表")
public class UmsMenuController implements IBaseController<UmsMenuService, UmsMenu> {

    private final UmsMenuService umsMenuService;

    @Override
    public UmsMenuService getService() {
        return umsMenuService;
    }

}
