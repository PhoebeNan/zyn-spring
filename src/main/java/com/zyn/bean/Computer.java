package com.zyn.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author zhaoyanan
 * @create 2020-02-21-14:32
 */
@Component
public class Computer {

    public Computer() {
        System.out.println("Computer执行构造方法...");
    }

    @PostConstruct
    public void init(){
        System.out.println("Computer执行init方法...");
    }

    @PreDestroy
    public void destory(){
        System.out.println("Computer执行destory方法...");
    }
}
