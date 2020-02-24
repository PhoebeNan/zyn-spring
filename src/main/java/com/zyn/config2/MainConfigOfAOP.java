package com.zyn.config2;

import com.zyn.bean2.Calculator;
import com.zyn.bean2.LogAspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * AOP:
 *      1.底层就是动态代理技术
 *      2.AOP是指在程序运行期间动态的将某一段代码切入到指定方法的指定位置进行运行的编程方式
 * @create 2020-02-24-10:14
 */
@EnableAspectJAutoProxy
@Configuration
public class MainConfigOfAOP {

    @Bean
    public Calculator getCalculator(){
        return new Calculator();
    }

    @Bean
    public LogAspects getLogAspects(){
        return new LogAspects();
    }
}
