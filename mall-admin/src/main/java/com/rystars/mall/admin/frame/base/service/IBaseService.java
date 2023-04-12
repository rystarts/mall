package com.rystars.mall.admin.frame.base.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.rystars.mall.admin.frame.page.PageParam;

/**
 * @author rystars
 * @since 2023/4/12
 * 公共的Service
 **/
public interface IBaseService<T> extends IService<T> {

    /**
     * 查询第一条数据
     *
     * @param queryWrapper 查询条件
     * @return 实体
     */
    T getFirst(Wrapper<T> queryWrapper);

    /**
     * 分页查询
     *
     * @param pageParam    分页查询参数
     * @param queryWrapper 查询wrapper
     * @return 分页信息
     */
    IPage<T> queryPage(PageParam pageParam, QueryWrapper<T> queryWrapper);

}
