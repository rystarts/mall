package ${baseInfo.packageName};

import ${tableClass.fullClassName};
import ${service.packageName}.${service.fileName};
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rystars.mall.admin.frame.page.PageParam;
import com.rystars.mall.admin.frame.result.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author rystars
 * @date ${.now?string('yyyy-MM-dd HH:mm:ss')}
 * @description 【${tableClass.tableName}<#if tableClass.remark?has_content>(${tableClass.remark!})</#if>】Controller
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/${tableClass.tableName?replace('_', '/')}")
@Tag(name = "${baseInfo.fileName}", description = "${tableClass.remark}")
public class ${baseInfo.fileName} {

    private final ${service.fileName} ${service.fileName?uncap_first};
    @Operation(summary = "新增")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result<${tableClass.shortClassName}> save(@Parameter(name = "${tableClass.remark}", required = true)
                                                     @RequestBody ${tableClass.shortClassName} ${tableClass.shortClassName?uncap_first}) {
        return Result.instance(${tableClass.shortClassName?uncap_first}Service.save(${tableClass.shortClassName?uncap_first}));
    }
    @Operation(summary = "更新")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result<${tableClass.shortClassName}> update(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id,
                                                       @RequestBody ${tableClass.shortClassName} ${tableClass.shortClassName?uncap_first}) {
        boolean result = ${tableClass.shortClassName?uncap_first}Service.update(${tableClass.shortClassName?uncap_first}, new UpdateWrapper<${tableClass.shortClassName}>().eq("id", id));
        return Result.instance(result);
    }
    @Operation(summary = "删除")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result<${tableClass.shortClassName}> delete(@Parameter(name = "主键", required = true)
                                                       @PathVariable(value = "id") String id) {
        return Result.instance(${tableClass.shortClassName?uncap_first}Service.removeById(id));
    }
    @Operation(summary = "根据ID查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result<${tableClass.shortClassName}> queryById(@Parameter(name = "主键", required = true)
                                                          @PathVariable(value = "id") String id) {
        return Result.success(${tableClass.shortClassName?uncap_first}Service.getById(id));
    }
    @Operation(summary = "查询所有")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<List<${tableClass.shortClassName}>> queryAll() {
        return Result.success(${tableClass.shortClassName?uncap_first}Service.list());
    }
    @Operation(summary = "分页查询")
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Result<IPage<${tableClass.shortClassName}>> queryPage(@RequestBody PageParam page) {
        return Result.success(${tableClass.shortClassName?uncap_first}Service.queryPage(page, null));
    }

}
