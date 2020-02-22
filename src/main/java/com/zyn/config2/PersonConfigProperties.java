package com.zyn.config2;

import com.zyn.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author zhaoyanan
 * @create 2020-02-22-12:13
 */
@PropertySource(value = {"classpath:person.properties"})  //通过此注解来加载properties配置文件，可以配合@Value使用 @Value("${person.name}")
@Configuration
public class PersonConfigProperties {

    @Bean
    public Person person(){

        return new Person();
    }
}
