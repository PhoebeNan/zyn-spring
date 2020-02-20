package com.zyn.config;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * 对于@ComponentScan的自定义过滤规则
 *
 * @author zhaoyanan
 * @create 2020-02-20-13:12
 */
public class MyTypeFilter implements TypeFilter {

    /**
     * @param metadataReader        读取当前类元数据信息的类
     * @param metadataReaderFactory
     * @return true 匹配到注解过滤的类
     * @throws IOException
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        //获取当前正在扫描类的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();

        //获取当前正在扫描类的注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();


        System.out.println("---------->" + classMetadata.getClassName());
        //System.out.println(annotationMetadata);

        if (classMetadata.getClassName().contains("er")){
            return true;
        }
        return false;
    }
}
