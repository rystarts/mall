package com.rystars.mall.admin.ums.member.controller;

import com.rystars.mall.admin.frame.base.controller.IBaseController;
import com.rystars.mall.admin.ums.member.bean.UmsMemberTask;
import com.rystars.mall.admin.ums.member.service.UmsMemberTaskService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【ums_member_task(会员任务表)】Controller
 *
 * @author rystars
 * @date 2023-04-14 17:12:53
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/ums/member/task")
@Tag(name = "UmsMemberTaskController", description = "会员任务表")
public class UmsMemberTaskController implements IBaseController<UmsMemberTaskService, UmsMemberTask> {

    private final UmsMemberTaskService umsMemberTaskService;

    @Override
    public UmsMemberTaskService getService() {
        return umsMemberTaskService;
    }

}
