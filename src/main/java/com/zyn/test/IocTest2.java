package com.zyn.test;

import com.zyn.bean.Person;
import com.zyn.config2.MainConfigOfAutowired;
import com.zyn.config2.PersonConfigProperties;
import com.zyn.controller.BookController;
import com.zyn.dao.BookDao;
import com.zyn.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Controller;

/**
 * @author zhaoyanan
 * @create 2020-02-22-12:16
 */
public class IocTest2 {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

    @Test
    public void demo3(){
        BookService bookService = context.getBean(BookService.class);

        //System.out.println(bookService);
        bookService.printBookDao();
    }

    @Test
    public void demo2(){
        BookController bookController = context.getBean(BookController.class);

        bookController.printService();

        BookDao bookDao = context.getBean(BookDao.class);

        //bookDao.printServicex();
    }

    @Test
    public void demo1(){
        getBeanAllNames();

        System.out.println("===========");
        Person person = (Person) context.getBean("person");
        System.out.println("person = " + person);

        System.out.println("===========");

        //配置文件中的值默认加载到环境变量中
        ConfigurableEnvironment environment = context.getEnvironment();
        String property = environment.getProperty("person.name");
        System.out.println(property);
    }

    //打印所有ioc容器中的bean
    private void getBeanAllNames(){
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            System.out.println(definitionName);
        }
    }
}
