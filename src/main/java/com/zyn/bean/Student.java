package com.zyn.bean;

/**
 * @author zhaoyanan
 * @create 2020-02-21-13:50
 */
public class Student {

    public Student() {
        System.out.println("Student执行构造方法...");
    }

    public void init(){
        System.out.println("Student执行init方法...");
    }

    public void destory(){
        System.out.println("Student执行destory方法...");
    }
}
