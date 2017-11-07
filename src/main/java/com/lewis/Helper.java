package com.lewis;

import cn.org.rapid_framework.generator.GeneratorFacade;
import cn.org.rapid_framework.generator.ext.tableconfig.model.TableConfig;
import cn.org.rapid_framework.generator.ext.tableconfig.model.TableConfigSet;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by Administrator on 2017/10/31.
 */
public class Helper {
    public static List<String> getTableConfigFiles(File basedir) {
        String[] tableConfigFilesArray = basedir.list();
        List<String> result = new ArrayList();
        for(String str : tableConfigFilesArray) {
            if(str.endsWith(".xml")) {
                result.add(str);
            }
        }
        return result;
    }
    public static Collection<TableConfig> getTableConfigs(TableConfigSet tableConfigSet, String tableSqlName) {
        if("*".equals(tableSqlName)) {
            return tableConfigSet.getTableConfigs();
        }else {
            TableConfig tableConfig = tableConfigSet.getBySqlName(tableSqlName);
            if(tableConfig == null) {
                throw new RuntimeException("根据表名:${tableSqlName}没有找到配置文件");
            }
            return Arrays.asList(tableConfig);
        }
    }

    public static GeneratorFacade createGeneratorFacade(String outRootDir, String... templateRootDirs) {
        if(templateRootDirs == null) throw new IllegalArgumentException("templateRootDirs must be not null");
        if(outRootDir == null) throw new IllegalArgumentException("outRootDir must be not null");

        GeneratorFacade gf = new GeneratorFacade();
        gf.getGenerator().setTemplateRootDirs(templateRootDirs);
        gf.getGenerator().setOutRootDir(outRootDir);
        try {
            gf.getGenerator().deleteOutRootDir();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gf;
    }

}
