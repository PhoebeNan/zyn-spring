package com.zyn.config2;

import com.zyn.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * 自动装配：
 * spring利用依赖注入(DI),完成对ioc容器中各个组件依赖关系的赋值
 *
 * @author zhaoyanan
 * @create 2020-02-22-12:31
 */
@Configuration
@ComponentScan(value = {"com.zyn.dao","com.zyn.service","com.zyn.controller"})
public class MainConfigOfAutowired {

    @Primary  // 让spring进行自动装配时，默认使用首选的bean，不过也可以继续使用@Qualifier指定spring装配bean的id
    @Bean("v22")
    public BookDao bookDao2(){
        BookDao bookDao = new BookDao();
        bookDao.setLabel("2");
        return bookDao;
    }
}
