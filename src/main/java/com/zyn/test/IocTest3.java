package com.zyn.test;

import com.zyn.bean2.Calculator;
import com.zyn.bean2.Dog;
import com.zyn.config2.AutoConfigTest;
import com.zyn.config2.MainConfigOfAOP;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhaoyanan
 * @create 2020-02-24-8:28
 */
public class IocTest3 {

    @Test
    public void demo2(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);

        Calculator calculator = annotationConfigApplicationContext.getBean(Calculator.class);
        int div = calculator.div(1, 1);
        System.out.println(div);
    }

    @Test
    public void demo1(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AutoConfigTest.class);

        Dog d = annotationConfigApplicationContext.getBean(Dog.class);
        System.out.println(d);
    }
}
