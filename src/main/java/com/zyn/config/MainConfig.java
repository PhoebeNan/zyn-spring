package com.zyn.config;

import com.zyn.bean.Person;
import com.zyn.dao.BookDao;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**

 * @author zhaoyanan
 * @create 2020-02-20-10:40
 */
@Configuration //配置类=配置文件，告诉spring ioc容器这是一个配置类
@ComponentScan(value = "com.zyn",includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Controller.class, Service.class}),
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookDao.class}),
        //@ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class}),
},useDefaultFilters = false)
public class MainConfig {

    //返回值等同于配置文件中的Class，方法名等同于id
    @Bean(value = "p")
    public Person person(){
        return new Person("zyn",188);
    }
}
