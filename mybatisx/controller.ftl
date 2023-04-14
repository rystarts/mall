package ${baseInfo.packageName};

import ${tableClass.fullClassName};
import ${service.packageName}.${service.fileName};
import com.rystars.mall.admin.frame.base.controller.IBaseController;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * 【${tableClass.tableName}<#if tableClass.remark?has_content>(${tableClass.remark!})</#if>】Controller
 * @author rystars
 * @date ${.now?string('yyyy-MM-dd HH:mm:ss')}
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/${tableClass.tableName?replace('_', '/')}")
@Tag(name = "${baseInfo.fileName}", description = "${tableClass.remark}")
public class ${baseInfo.fileName} implements IBaseController<${service.fileName}, ${tableClass.shortClassName}>{

    private final ${service.fileName} ${service.fileName?uncap_first};

    @Override
    public ${service.fileName} getService() {
        return ${service.fileName?uncap_first};
    }

}
