package com.rystars.mall.admin.frame.base.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rystars.mall.admin.frame.base.service.IBaseService;
import com.rystars.mall.admin.frame.page.PageParam;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author rystars
 * @since 2023/4/12
 * mybatis-plus 下再加一层 放自定义的公共方法
 **/
public class IBaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements IBaseService<T> {

    @Override
    public T getFirst(Wrapper<T> queryWrapper) {
        List<T> entityList = getBaseMapper().selectList(queryWrapper);
        if (!CollectionUtils.isEmpty(entityList)) {
            return entityList.get(0);
        }
        return null;
    }

    @Override
    public IPage<T> queryPage(PageParam pageParam, QueryWrapper<T> queryWrapper) {
        Page<T> page = new Page<>(pageParam.getCurrent(), pageParam.getSize());
        return getBaseMapper().selectPage(page, queryWrapper);
    }
}
