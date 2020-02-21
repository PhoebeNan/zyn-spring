package com.zyn.config2;

import com.zyn.bean.Car;
import com.zyn.bean.Color;
import com.zyn.bean.Person;
import com.zyn.beanFactory.MyFactoryBean;
import com.zyn.condition.LinuxCondition;
import com.zyn.condition.WindowCondition;
import com.zyn.imports.MyImportBeanDefinitionRegistrar;
import com.zyn.imports.MyImportSelector;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

/**
 * @author zhaoyanan
 * @create 2020-02-20-13:41
 */
@Configuration
@Conditional({WindowCondition.class})
@Import({Color.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class}) //将组件注入到ioc容器中，注解中属性的值可以传入多个组件，类似与注解@Bean
//相当于将组件注入到ioc容器的批处理过程
public class MainConfig2 {

    @Bean
    public MyFactoryBean teacherBeanFactory(){
        //返回的是getObject()的返回对象，也就是Teacher对象实例
        return new MyFactoryBean();
    }

    /**
     * @Conditional 按照一定的条件进行判断，满足条件才会给ioc容器中注入bean
     */
    @Conditional({WindowCondition.class})
    @Bean(value = "bill")
    public Person person1() {

        return new Person("bill", 333);
    }

    @Conditional(LinuxCondition.class)
    @Bean(value = "linux")
    public Person person2() {

        return new Person("linux", 123);
    }


    /**
     *  1.使用scope来控制bean的作用范围，SCOPE_SINGLETON创建一个bean，SCOPE_PROTOTYPE表示创建多个bean实例对象
     *  2.返回值等同于配置文件中的Class，方法名等同于id(xml)
     *  3.懒加载在获取容器中对象的时候创建对象，默认是在ioc容器创建的时候创建对象
     * @return
     */
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Lazy
    @Bean(value = "p2")
    public Person person(){
        System.out.println("ioc创建bean对象...");
        return new Person("qqq",33);
    }

}
