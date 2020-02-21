package com.zyn.imports;

import com.zyn.bean.Earth;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zhaoyanan
 * @create 2020-02-21-12:39
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     *
     * @param importingClassMetadata 可以获取标注@import注解类的所有注解信息，如果@Configuration等注解信息
     * @param registry 可以手动的将bean注入到容器中
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        boolean bill = registry.containsBeanDefinition("bill");
        if(bill){

            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Earth.class);
            //参数一表示对bean起的名字，参数二表示定义注入的bean
            registry.registerBeanDefinition("pubg", rootBeanDefinition);
        }
    }
}
