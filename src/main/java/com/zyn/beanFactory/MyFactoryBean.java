package com.zyn.beanFactory;

import com.zyn.bean.Teacher;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author zhaoyanan
 * @create 2020-02-21-13:19
 */
public class MyFactoryBean implements FactoryBean<Teacher> {

    //返回一个Teacher bean对象，此对象会由工厂注入到ioc容器中
    @Override
    public Teacher getObject() throws Exception {

        return new Teacher();
    }

    //获取泛型对象bean的字节码对象
    @Override
    public Class<?> getObjectType() {
        return Teacher.class;
    }

    //true: 返回一个单实例teacher对象，容器中保存一份
    //false: 每次获取bean对象时，将会创建一个新的bean。多实例对象
    @Override
    public boolean isSingleton() {
        return false;
    }
}
