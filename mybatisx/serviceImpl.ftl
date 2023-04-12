package ${baseInfo.packageName};

import ${tableClass.fullClassName};
import ${service.packageName}.${service.fileName};
import ${mapper.packageName}.${mapper.fileName};
<#if baseService??&&baseService!="">
import ${baseService};
    <#list baseService?split(".") as simpleName>
        <#if !simpleName_has_next>
            <#assign serviceSimpleName>${simpleName}</#assign>
        </#if>
    </#list>
</#if>
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author rystars
 * @date ${.now?string('yyyy-MM-dd HH:mm:ss')}
 * @description 【${tableClass.tableName}<#if tableClass.remark?has_content>(${tableClass.remark!})</#if>】ServiceImpl
 *
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class ${baseInfo.fileName} extends IBaseServiceImpl<${mapper.fileName}, ${tableClass.shortClassName}> implements ${service.fileName}{

    private final ${mapper.fileName} ${mapper.fileName?uncap_first};

}




