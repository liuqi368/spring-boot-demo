package com.example.thread;

/**
 * @author liuqi
 * @Title: MyThread
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/3/2813:34
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        // TODO Auto-generated method stub
//        super.run();
        System.out.println(Thread.currentThread().getName()+"正在执行....");
    }
}
