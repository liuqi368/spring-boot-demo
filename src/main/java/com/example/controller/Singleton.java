package com.example.controller;

/**
 * @author liuqi
 * @Title: Singleton
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/8/209:24
 */
public class Singleton {

    /*private Singleton(){}

    private static Singleton singleton=null;

    public static synchronized Singleton getInstance(){
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }*/

    private static class Lazy{
        private static final Singleton singleton=new Singleton();
    }

    private Singleton(){}

    public static final Singleton getInstance(){
        return Lazy.singleton;
    }
}
