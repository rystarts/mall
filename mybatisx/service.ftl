package ${baseInfo.packageName};

import ${tableClass.fullClassName};
<#if baseService??&&baseService!="">
import ${baseService};
    <#list baseService?split(".") as simpleName>
        <#if !simpleName_has_next>
            <#assign serviceSimpleName>${simpleName}</#assign>
        </#if>
    </#list>
</#if>
import com.rystars.mall.admin.frame.base.service.IBaseService;

/**
 * @author rystars
 * @date ${.now?string('yyyy-MM-dd HH:mm:ss')}
 * @description 【${tableClass.tableName}<#if tableClass.remark?has_content>(${tableClass.remark!})</#if>】Service
 */
public interface ${baseInfo.fileName} extends IBaseService<${tableClass.shortClassName}> {

}
