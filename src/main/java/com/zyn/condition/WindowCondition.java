package com.zyn.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author zhaoyanan
 * @create 2020-02-20-14:34
 */
public class WindowCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        //获取当前ioc容器环境相关的信息
        Environment environment = context.getEnvironment();
        String property = environment.getProperty("os.name");
        if(property.contains("Windows")){
            //将满足条件的bean注册到ioc容器中
            return true;
        }

        //false表示不注册到ioc容器中
        return false;
    }
}
