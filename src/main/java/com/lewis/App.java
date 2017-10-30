package com.lewis;

import cn.org.rapid_framework.generator.GeneratorFacade;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        GeneratorFacade g = new GeneratorFacade();
        g.getGenerator().addTemplateRootDir("D:\\rapid\\rapid-learn\\src\\main\\java\\com\\lewis\\template");
        g.deleteOutRootDir();
        g.generateByTable("actionlog");
    }
}
