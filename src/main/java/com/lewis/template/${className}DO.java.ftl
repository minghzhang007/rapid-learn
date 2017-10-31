<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage};


import lombok.Data;
import lombok.NoArgsConstructor;

/**
<#if table.remarks?exists && table.remarks != '' && table.remarks != 'null'>
* ${table.remarks}
</#if>
* @author:zhangminghua
* @version:1.0
* @since:1.0
* @createTime:<#if now??>${now?string('yyyy-MM-dd HH:mm:ss')}</#if>
*/
@Data
@NoArgsConstructor
public class ${className}DO implements java.io.Serializable{

private static final long serialVersionUID = 1L;

<#list table.columns as column>
    <#if column.remarks?exists && column.remarks != '' && column.remarks != 'null'>
    /**
     * ${column.remarks}  db_column: ${column.sqlName}
     */
    </#if>
    private ${column.simpleJavaType} ${column.columnNameLower};

</#list>


}