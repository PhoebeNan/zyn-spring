package com.zyn.test;

import com.zyn.bean.Person;
import com.zyn.config.MainConfig;
import com.zyn.config2.MainConfig2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhaoyanan
 * @create 2020-02-20-12:25
 */
public class IocTest {

    @Test
    public void demo2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        Person p1 = (Person) context.getBean("p2");
        Person p2 = (Person) context.getBean("p2");

        System.out.println(p1);
        System.out.println(p1==p2);
    }

    @Test
    public void demo1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
