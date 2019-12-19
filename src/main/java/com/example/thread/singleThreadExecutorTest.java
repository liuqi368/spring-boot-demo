package com.example.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author liuqi
 * @Title: singleThreadExecutorTest
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/3/2813:35
 */
public class singleThreadExecutorTest {

    private static Logger logger = LoggerFactory.getLogger(singleThreadExecutorTest.class);


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //创建一个可重用固定线程数的线程池
        //ExecutorService pool= Executors.newSingleThreadExecutor();
        //创建一个固定线程的线程池
        //ExecutorService pool= Executors.newFixedThreadPool(2);
        //创建一个可缓存的线程池。如果线程池的大小超过了处理任务所需要的线程
        //ExecutorService pool= Executors.newCachedThreadPool();

        //创建实现了Runnable接口对象，Thread对象当然也实现了Runnable接口;

        /*Thread t1=new MyThread();

        Thread t2=new MyThread();

        Thread t3=new MyThread();

        Thread t4=new MyThread();

        Thread t5=new MyThread();

        //将线程放到池中执行；

        pool.execute(t1);

        pool.execute(t2);

        pool.execute(t3);

        pool.execute(t4);

        pool.execute(t5);

        //关闭线程池

        pool.shutdown();*/
        cachedThreadPool();

    }


    public static void cachedThreadPool(){
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                Thread.sleep(index * 1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            cachedThreadPool.execute(new Runnable() {

                @Override
                public void run() {
                    System.out.println(index);
                }
            });
        }
    }

    public static void fixedThreadPool(){
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            final int index = i;

            fixedThreadPool.execute(new Runnable() {

                @Override
                public void run() {
                    try {
                        System.out.println(index);
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
