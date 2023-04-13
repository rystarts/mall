package ${mapper.packageName};

import ${tableClass.fullClassName};
<#if tableClass.pkFields??>
    <#list tableClass.pkFields as field><#assign pkName>${field.shortTypeName}</#assign></#list>
</#if>
import com.rystars.mall.admin.frame.base.mapper.IBaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 【${tableClass.tableName}<#if tableClass.remark?has_content>(${tableClass.remark!})</#if>】Mapper
 * @author rystars
 * @date ${.now?string('yyyy-MM-dd HH:mm:ss')}
 */
@Mapper
public interface ${mapper.fileName} extends IBaseMapper<${tableClass.shortClassName}> {

}




