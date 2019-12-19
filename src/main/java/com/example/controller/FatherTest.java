package com.example.controller;

/**
 * @author liuqi
 * @Title: FatherTest
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/7/2917:10
 */
public class FatherTest {
    private String name;

    FatherTest(){

        System.out.println("--父类的无参构造函数--");

    }

    FatherTest(String name){

        this.name=name;

        System.out.println("--父类的有参构造函数--"+this.name);

    }

    static{

        System.out.println("--父类的静态代码块--");

    }

    {

        System.out.println("--父类的非静态代码块--");

    }

    public void speak(){

        System.out.println("--父类的方法--");

    }

//加入一个main程序后

public static void main(String[] args) {

        System.out.println("--父类主程序--");

        FatherTest father=new FatherTest("父亲的名字");

        father.speak();

        }
}
