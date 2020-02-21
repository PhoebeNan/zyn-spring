package com.zyn.imports;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zhaoyanan
 * @create 2020-02-21-12:03
 */
public class MyImportSelector implements ImportSelector {


    /**
     * @param importingClassMetadata 可以获取标注@import注解类的所有注解信息，如果@Configuration等注解信息
     * @return 返回的字符串数组表示导入到容器中组件的全类名
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        return new String[]{"com.zyn.bean.Car"};
    }
}
