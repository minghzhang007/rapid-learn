package com.lewis;

import cn.org.rapid_framework.generator.GeneratorFacade;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        GeneratorFacade g = new GeneratorFacade();
        g.getGenerator().addTemplateRootDir("E:\\code\\github_workspace\\rapid-learn\\src\\main\\java\\com\\lewis\\template");
        g.deleteOutRootDir();
        g.generateByTable("actionlog");
    }
}
