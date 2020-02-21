package com.zyn.config;

import com.zyn.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author zhaoyanan
 * @create 2020-02-21-13:53
 */
@Configuration
@ComponentScan(value = "com.zyn")
public class BeanLifeCycleConfig {


    @Scope(scopeName = "prototype")
    @Bean(initMethod = "init",destroyMethod = "destory")
    public Student student1(){

        return new Student();
    }
}
