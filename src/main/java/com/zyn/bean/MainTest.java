package com.zyn.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhaoyanan
 * @create 2020-02-20-10:36
 */
public class MainTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) applicationContext.getBean("person");

        System.out.println(person.getName());
    }
}
