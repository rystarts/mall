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

    /**
     * 获取实现类Service
     * @return 实现类Service
     */
    S getService();

    /**
     * 保存单个实体
     * @param bean 实体
     * @return Result
     */
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    default Result<T> save(@Parameter(name = "实体", required = true)
                           @RequestBody T bean) {
        return Result.instance(getService().save(bean));
    }

    /**
     * 根据ID更新
     * @param id 主键
     * @param bean 实体
     * @return Result
     */
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    default Result<T> update(@Parameter(name = "主键", required = true)
                             @PathVariable(value = "id") String id,
                             @RequestBody T bean) {
        boolean result = getService().update(bean, new UpdateWrapper<T>().eq("id", id));
        return Result.instance(result);
    }

    /**
     * 根据ID删除
     * @param id 主键
     * @return Result
     */
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    default Result<T> delete(@Parameter(name = "主键", required = true)
                             @PathVariable(value = "id") String id) {
        return Result.instance(getService().removeById(id));
    }

    /**
     * 根据ID查询
     * @param id 主键
     * @return Result
     */
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    default Result<T> queryById(@Parameter(name = "主键", required = true)
                                @PathVariable(value = "id") String id) {
        return Result.success(getService().getById(id));
    }

    /**
     * 查询所有信息
     * @return Result
     */
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    default Result<List<T>> queryAll() {
        return Result.success(getService().list());
    }

    /**
     * 分页查询
     * @param page 分页查询对象
     * @return Result
     */
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    default Result<IPage<T>> queryPage(@RequestBody PageParam page) {
        return Result.success(getService().queryPage(page, null));
    }

}
