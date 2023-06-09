package com.rystars.mall.admin.ums.admin.mapper;

import com.rystars.mall.admin.frame.base.mapper.IBaseMapper;
import com.rystars.mall.admin.ums.admin.bean.UmsAdminPermissionRelation;
import org.apache.ibatis.annotations.Mapper;

/**
 * 【ums_admin_permission_relation(后台用户和权限关系表(除角色中定义的权限以外的加减权限))】Mapper
 *
 * @author rystars
 * @date 2023-04-14 17:12:20
 */
@Mapper
public interface UmsAdminPermissionRelationMapper extends IBaseMapper<UmsAdminPermissionRelation> {

}




