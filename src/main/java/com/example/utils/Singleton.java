package com.example.utils;

import java.util.Random;

/**
 * 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 * 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
 * @author liuqi
 * @Title: Singleton
 * @ProjectName spring-boot-demo
 * @Description: TODO
 * @date 2019/2/1513:57
 */
public class Singleton {

    private Singleton(){}

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }

    public int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.ints(min, (max + 1)).findFirst().getAsInt();
    }

}
