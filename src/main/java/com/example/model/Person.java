package com.example.model;

import java.io.Serializable;

/**
 * @author liuqi
 * @Title: Person
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/7/515:55
 */
public class Person implements Serializable{

    private static final long serialVersionUID = 8656128222714547171L;

    private String name;//需要序列化

    transient private int age;//不需要序列化

    private String sex;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
