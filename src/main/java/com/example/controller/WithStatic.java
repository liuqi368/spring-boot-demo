package com.example.controller;

/**
 * @author liuqi
 * @Title: WithStatic
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/9/3010:09
 */
public class WithStatic {
    //当创建子类对象时执行过程：
    // 父类static ->子类static->父类普通赋值语句->子类普通赋值语句->父类构造->子类构造
    // （同样修饰符的代码块与变量取决于先后顺序）
    private static int intValue = 0;

    private int sex = 0;

    public WithStatic(){
        intValue ++;
    }

    public static void main(String[] args) {

        WithStatic withStatic1 = new WithStatic();
        WithStatic withStatic2 = new WithStatic();

        System.out.println("with1:" + withStatic1.intValue);
        System.out.println("with2:" + withStatic2.intValue);

    }

    public static void testOne(){
        System.out.println("时间就是生命！！！！");
    }
}
