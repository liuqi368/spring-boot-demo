package com.example.service.impl;

import com.example.service.ISubject;

/**
 * @author liuqi
 * @Title: RealSubject
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/6/1913:41
 * 代理角色
 * 代理对象角色内部含有对真实对象的引用，从而可以操作真实对象，
 * 同时代理对象提供与真实对象相同的接口以便在任何时刻都能代替真实对象。
 * 同时，代理对象可以在执行真实对象操作时，附加其他的操作，相当于对真实对象进行封装。
 */
public class RealSubject implements ISubject{

    /**
     * 实现对象的接口
     * @param action
     */
    @Override
    public void doMain(String action) {
        System.out.println("I am RealSubject, do action="+action);
    }

    /**
     * 自定义方法
     * @param str
     */
    public void doString(String str){
        System.out.println("I am doString , do str="+str);
    }
}
