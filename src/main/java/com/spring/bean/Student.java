package com.spring.bean;

import org.springframework.beans.factory.annotation.Required;

/**
 * Created by ShenShuaihu on 2018/8/18.
 */
public class Student {
    private Integer age;
    private String name;

    @Required
    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }
    @Required
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
         }
}
