package com.rystars.mall.admin.ums.admin.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.ums.admin.bean.UmsAdmin;
import com.rystars.mall.admin.ums.admin.service.UmsAdminService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【ums_admin(后台用户表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:12:20
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/admin")
@Tag(name = "UmsAdminController", description = "后台用户表")
public class UmsAdminController implements IBaseController<UmsAdminService, UmsAdmin> {

    private final UmsAdminService umsAdminService;

    @Override
    public UmsAdminService getService() {
        return umsAdminService;
    }

}
