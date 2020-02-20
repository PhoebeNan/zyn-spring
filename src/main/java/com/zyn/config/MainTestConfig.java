package com.zyn.config;

import com.zyn.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhaoyanan
 * @create 2020-02-20-10:36
 */
public class MainTestConfig {


    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        Person person = (Person) applicationContext.getBean("p");

        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String name : beanNamesForType) {
            System.out.println(name);
        }

        System.out.println(person.toString());
    }


}
