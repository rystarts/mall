package com.rystars.mall.admin.frame.base.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import com.rystars.mall.admin.frame.base.service.IBaseService;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 公共的Controller
 *
 * @author rystars
 * @since 2023/4/14
 **/
public interface IBaseController<S extends IBaseService<T>, T extends BaseBean> {

    S getService();

    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    default Result<T> save(@Parameter(name = "品牌表", required = true)
                           @RequestBody T bean) {
        return Result.instance(getService().save(bean));
    }

    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    default Result<T> update(@Parameter(name = "主键", required = true)
                             @PathVariable(value = "id") String id,
                             @RequestBody T bean) {
        boolean result = getService().update(bean, new UpdateWrapper<T>().eq("id", id));
        return Result.instance(result);
    }

    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    default Result<T> delete(@Parameter(name = "主键", required = true)
                             @PathVariable(value = "id") String id) {
        return Result.instance(getService().removeById(id));
    }

    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    default Result<T> queryById(@Parameter(name = "主键", required = true)
                                @PathVariable(value = "id") String id) {
        return Result.success(getService().getById(id));
    }

    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    default Result<List<T>> queryAll() {
        return Result.success(getService().list());
    }

    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    default Result<IPage<T>> queryPage(@RequestBody PageParam page) {
        return Result.success(getService().queryPage(page, null));
    }

}
