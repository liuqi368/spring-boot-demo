package com.example.controller;

/**
 * @author liuqi
 * @Title: Thread2
 * @ProjectName spring-boot-demo
 * @Description: TODO
 * @date 2019/2/1215:22
 */
public class Thread2 implements Runnable{
        private int threadCnt = 10;

        @Override
        public void run() {
            while (true) {
                if (threadCnt > 0) {
                    System.out.println(Thread.currentThread().getName() + " 剩余个数 " + threadCnt);
                    threadCnt--;
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }

        public static void main(String[] args) {
            Thread2 thread = new Thread2();
            new Thread(thread).start();
            new Thread(thread).start();
            new Thread(thread).start();
            new Thread(thread).start();
        }
}
