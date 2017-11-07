<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<#assign className=table.className/>
<#assign classNameLowerCase=table.className?lower_case/>
<#macro namespace>${appName}.${table.className}.</#macro>
<mapper namespace="${basepackage}.${className}Mapper">

<#-- add jdbcType for resultMap -->
<#--
<#list table.resultMaps as resultMap>
    <resultMap id="${resultMap.name}" class="${table.basepackage}.${table.className}${deployModule}DO">
        <#list resultMap.columns as column>
            <result property="${column.name}" column="${column.name}"
                    javaType="${column.javatype}"  <#if column.hasNullValue> nullValue="${column.nullValue}" </#if>/>
        </#list>
    </resultMap>
</#list>
-->

    <resultMap id="RM.${table.className}" type="${basepackage}.${table.className}DO">
    <#list table.columns as column>
        <result property="${column.columnNameFirstLower}" column="${column.sqlName}" javaType="${column.javaType}" jdbcType="${column.jdbcSqlTypeName}" <#if column.hasNullValue> nullValue="${column.nullValue}" </#if> />
    </#list>
    </resultMap>

<#--<#list table.includeSqls as item>
    <sql id="${item.id}">
    ${item.sql?trim}
    </sql>
</#list>-->
</mapper>
