package com.zyn.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author zhaoyanan
 * @create 2020-02-20-10:32
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Value("${person.name}")
    private String name;

    private Integer age;

}
