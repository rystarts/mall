package com.rystars.mall.admin.frame.base.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author rystars
 * @since 2023/4/12
 * 公共的Service
 **/
public interface IBaseService<T> extends IService<T> {

    /**
     * 查询第一条数据
     * @return 实体
     */
    T getFirst(Wrapper<T> queryWrapper);

}
