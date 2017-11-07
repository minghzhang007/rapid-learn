package com.lewis;

import freemarker.template.Configuration;

public class FreemarkerDemo {
    public static void main(String[] args) {
        Configuration cfg = getConfiguration();
        System.out.println(cfg);
    }

    private static Configuration getConfiguration() {
        Configuration cfg = new Configuration();
        cfg.setNumberFormat("###############");
        cfg.setBooleanFormat("true,false");
        cfg.setDefaultEncoding("utf-8");
        return cfg;
    }
}
