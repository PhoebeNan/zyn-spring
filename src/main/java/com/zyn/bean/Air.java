package com.zyn.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author zhaoyanan
 * @create 2020-02-21-14:15
 */
public class Air implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        //销毁bean时执行的方法
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //在bean初始化时执行的方法
    }
}
