package com.example.service;

/**
 * @author liuqi
 * @Title: ISubject
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/6/1913:40
 * 抽象角色
 * 声明真实对象和代理对象的共同接口
 */
public interface ISubject {

    void doMain(String action);

    void doString(String str);

}
