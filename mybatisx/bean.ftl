package ${bean.packageName};

import java.util.*;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serializable;
import java.io.Serial;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import com.rystars.mall.admin.frame.base.bean.BaseBean;

/**
 * 【${tableClass.tableName}<#if tableClass.remark?has_content>(${tableClass.remark!})</#if>】Bean
 * @author rystars
 * @date ${.now?string('yyyy-MM-dd HH:mm:ss')}
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="${tableClass.tableName}")
@Schema(description = "${tableClass.tableName}<#if tableClass.remark?has_content>(${tableClass.remark!})</#if>")
public class ${bean.fileName} extends BaseBean<${bean.fileName}> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

<#list tableClass.allFields as field>
    <#if field.fieldName=="id">@TableId(type= IdType.AUTO)</#if>
    @Schema(description = "<#if field.remark?has_content>${field.remark!}<#else>${field.fieldName!}</#if>")
    private ${field.shortTypeName} ${field.fieldName};
</#list>

}




