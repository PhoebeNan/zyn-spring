package com.zyn.service;

import com.zyn.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author zhaoyanan
 * @create 2020-02-20-12:23
 */
@Service
public class BookService {

    //4.自动装配默认一定要将属性赋值，可以使用required = false避免
    //2.@Autowired 如果找到多个相同类型的组件，ioc容器会将其属性名作为组件的id进行查找  context.getBean("bookDao2");
    @Qualifier("bookDao")  //3.使用@Qualifier指定装配的组件id，而不是使用属性名当id查找
    @Autowired(required = false)   //1.@Autowired默认优先按照类型去找对应的组件，找到之后赋值给变量，相当于：bookDao = context.getBean(BookDao.class);
    private BookDao bookDao2;

    public void printBookDao(){
        System.out.println(bookDao2);
    }

}
