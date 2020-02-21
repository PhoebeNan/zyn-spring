package com.zyn.test;

import com.zyn.bean.Computer;
import com.zyn.bean.Person;
import com.zyn.bean.Student;
import com.zyn.config.BeanLifeCycleConfig;
import com.zyn.config.MainConfig;
import com.zyn.config2.MainConfig2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Map;

/**
 * @author zhaoyanan
 * @create 2020-02-20-12:25
 */
public class IocTest {

    ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);

    @Test
    public void demo7() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanLifeCycleConfig.class);
        System.out.println("创建容器...");

        System.out.println("==========");
        Computer computer = (Computer) context.getBean("computer");
        System.out.println(computer);

        //关闭ioc容器时，执行销毁方法
        context.close();
    }

    @Test
    public void demo6() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanLifeCycleConfig.class);
        System.out.println("创建容器...");

        System.out.println("==========");
        Student student1 = (Student) context.getBean("student1");
        System.out.println(student1);

        //关闭ioc容器时，执行销毁方法
        context.close();
    }

    @Test
    public void demo5() {

        //在容器中获取时创建bean，getBean("teacherBeanFactory")默认为id
        //获取的是工厂bean调用getObject返回创建的对象
        Object teacherBeanFactory = context.getBean("teacherBeanFactory");

        //在id前加上&号，则获取的是工厂对象，全类名的形式
        Object BeanFactory = context.getBean("&teacherBeanFactory");
        System.out.println(teacherBeanFactory);
        System.out.println(BeanFactory);
    }

    @Test
    public void demo4() {
        printBeans(this.context);
    }

    private void printBeans(ApplicationContext context) {
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void demo3() {

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

//        Map<String, Person> beansOfType = context.getBeansOfType(Person.class);
//
//        System.out.println(beansOfType);
//        System.out.println("=========");
//
//        Person p1 = (Person) context.getBean("bill");
//        Person p2 = (Person) context.getBean("linux");
//
//        System.out.println(p1);
//        System.out.println(p2);
//
//        Environment environment = context.getEnvironment();
//        String property = environment.getProperty("os.name");
//        System.out.println(property);
    }

    @Test
    public void demo2() {
        System.out.println("ioc容器创建中...");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }


        Person p1 = (Person) context.getBean("p2");
        Person p2 = (Person) context.getBean("p2");

        System.out.println(p1);
        System.out.println(p1 == p2);
    }

    @Test
    public void demo1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
