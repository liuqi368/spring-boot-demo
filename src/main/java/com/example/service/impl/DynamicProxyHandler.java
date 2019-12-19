package com.example.service.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author liuqi
 * @Title: DynamicProxyHandler
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/6/1914:57
 * 动态代理实现
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object target;

    /**
     * 创建构造方法
     */
    public DynamicProxyHandler(Object target){
        this.target=target;
    }

    /**
     * 获取对象的方法
     * @param <T>
     * @return
     */
    public <T>T getProxy(){
        //该方法用于为指定类装载器、一组接口及调用处理器生成动态代理类实例
        return (T) Proxy.newProxyInstance(
                //该方法用于获取关联于指定类装载器和一组接口的动态代理类的类对象
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    /**
     * 该方法负责集中处理动态代理类上的所有方法调用。第一个参数既是代理类实例，第二个参数是被调用的方法对象
     * 第三个方法是调用参数。调用处理器根据这三个参数进行预处理或分派到委托类实例上发射执行
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("办事之前先收取点费用");
        System.out.println("开始办事");
        Object result = null;
        try {
            result = method.invoke(target, args);
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("办完了");
        return result;
    }
}
