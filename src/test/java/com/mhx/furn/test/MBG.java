package com.mhx.furn.test;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 马海鑫
 * @version 1.0
 */
public class MBG {

    @Test
    public void generator() throws Exception {

        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

    /**
     * @author 马海鑫
     * @version 1.0
     */
    public static class T1 {


        @Test
        public  void t1(){


           ApplicationContext ioc = new ClassPathXmlApplicationContext("spring.xml");

            System.out.println(ioc.getBean("dataSource"));
            System.out.println(ioc.getBean("sqlSessionFactory"));
        }
    }



}
