package com.lewis;

import cn.org.rapid_framework.generator.GeneratorFacade;
import cn.org.rapid_framework.generator.ext.tableconfig.builder.TableConfigXmlBuilder;
import cn.org.rapid_framework.generator.ext.tableconfig.model.TableConfigSet;

import java.io.File;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        /*GeneratorFacade g = new GeneratorFacade();
        g.getGenerator().addTemplateRootDir("D:\\rapid\\rapid-learn\\src\\main\\java\\com\\lewis\\template");
        g.deleteOutRootDir();
        g.generateByTable("actionlog");*/

        String basedir ="E:\\code\\github_workspace\\rapid-learn\\src\\main\\resources\\tables";
        String dirTableConfigs ="";
        String dal_package ="com.lewis.rapid.mapper";
        String dir_dal_output_root="D:\\rapid\\rapid-learn\\src\\main\\java\\com\\lewis\\rapid\\mapper";
        String genInputCmd="ActionLog";
        String templateDir="E:\\code\\github_workspace\\rapid-learn\\src\\main\\java\\com\\lewis\\template";
        String outputDir="E:\\code\\github_workspace\\rapid-learn\\src\\main\\java\\com\\lewis\\rapid\\mapper";
        List<String> tableConfigFiles = Helper.getTableConfigFiles(new File(basedir, dirTableConfigs));
        TableConfigSet tableConfigSet = new TableConfigXmlBuilder().parseFromXML(new File(basedir,dirTableConfigs),dal_package, tableConfigFiles);
       // GenUtils.genByTableConfigSet(Helper.createGeneratorFacade(dir_dal_output_root,"${dir_templates_root}/table_config_set/dal","${dir_templates_root}/share/dal"),tableConfigSet);
       // GenUtils.genByTableConfig(Helper.createGeneratorFacade(dir_dal_output_root,"${dir_templates_root}/table_config/dal","${dir_templates_root}/share/dal"),tableConfigSet,genInputCmd);
       // GenUtils.genByOperation(Helper.createGeneratorFacade(dir_dal_output_root,"${dir_templates_root}/operation/dal","${dir_templates_root}/share/dal"),tableConfigSet,genInputCmd);

        GeneratorFacade generatorFacade = Helper.createGeneratorFacade(outputDir, templateDir);
        generatorFacade.generateByTable("actionlog");
        GenUtils.genByOperation(generatorFacade,tableConfigSet,genInputCmd);
    }
}
