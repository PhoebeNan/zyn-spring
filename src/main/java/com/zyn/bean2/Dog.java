package com.zyn.bean2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 *  //在Dog对象被创建时，容器会回调重写的方法，并把参数中的的对象进行注入
 * @author zhaoyanan
 * @create 2020-02-24-8:25
 */
@Component
public class Dog implements ApplicationContextAware, BeanNameAware {

    private ApplicationContext applicationContext;

    @Override
    public void setBeanName(String s) {
        System.out.println(s);
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        this.applicationContext = applicationContext;
        System.out.println("这是ioc容器中的对象========="+applicationContext);
    }
}
