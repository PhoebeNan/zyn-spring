package com.zyn.config2;

import com.zyn.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhaoyanan
 * @create 2020-02-20-13:41
 */
@Configuration
@ComponentScans(value = {

})
public class MainConfig2 {

    //返回值等同于配置文件中的Class，方法名等同于id
    @Bean(value = "p2")
    public Person person(){
        return new Person("qqq",33);
    }
}
