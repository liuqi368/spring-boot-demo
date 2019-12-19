package com.example.service.impl;

import com.example.service.ISubject;

/**
 * @author liuqi
 * @Title: ProxySubject
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/6/1913:45
 */
public class ProxySubject implements ISubject{

    ISubject mRealSubject;

    /**
     * 创建构造方法
     * @param mRealSubject
     */
    public ProxySubject(ISubject mRealSubject){
        super();
        this.mRealSubject=mRealSubject;
    }

    /**
     * 实现接口
     * @param action
     */
    @Override
    public void doMain(String action) {
        postRequest();
        mRealSubject.doMain(action);
        preRequest();
    }

    @Override
    public void doString(String str) {
        System.out.println("I am ProxySubject doString ="+str);
    }

    /**
     * 自定义方法  before
     */
    public void postRequest(){
        System.out.println("I am postRequest.");
    }

    /**
     * 自定义方法 after
     */
    public void preRequest(){
        System.out.println("I am preRequest.");
    }
}
