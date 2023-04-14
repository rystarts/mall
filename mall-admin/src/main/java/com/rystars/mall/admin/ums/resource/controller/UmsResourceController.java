package com.rystars.mall.admin.ums.resource.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.ums.resource.bean.UmsResource;
import com.rystars.mall.admin.ums.resource.service.UmsResourceService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【ums_resource(后台资源表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:13:22
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/resource")
@Tag(name = "UmsResourceController", description = "后台资源表")
public class UmsResourceController implements IBaseController<UmsResourceService, UmsResource> {

    private final UmsResourceService umsResourceService;

    @Override
    public UmsResourceService getService() {
        return umsResourceService;
    }

}
