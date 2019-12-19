package com.example.controller;

/**
 * 使用特殊域变量(volatile)实现线程同步
 * @author liuqi
 * @Title: Thread3
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/8/518:35
 *   a.volatile关键字为域变量的访问提供了一种免锁机制，
 *   b.使用volatile修饰域相当于告诉虚拟机该域可能会被其他线程更新，
 *   c.因此每次使用该域就要重新计算，而不是使用寄存器中的值
 *   d.volatile不会提供任何原子操作，它也不能用来修饰final类型的变量
 *
 */
public class Thread3 {

    class Bank {

        //使用volatile修饰数据
        //private volatile int accout = 10;
        private int accout = 10;


        public int getAccout() {
            return accout;
        }

        public void saveAccount(int money) {
            //使用synchornized修饰方法实现线程的同步
            synchronized(this) {
                accout += money;
                System.out.println("account:" + accout);
            }
        }
    }

    class VolatileThread implements Runnable {

        private Bank bank;

        public VolatileThread(Bank bank) {
            this.bank = bank;
        }

        @Override
        public void run() {

            for (int i = 0; i < 10; i++) {
                bank.saveAccount(10);
                System.out.println(Thread.currentThread().getName() + "-->第" + i + "次当前账户余额：" + bank.getAccout() + "元。");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void userVolatileThread() {
        Bank bank = new Bank();

        VolatileThread volatileThread = new VolatileThread(bank);

        Thread thread1 = new Thread(volatileThread);

        Thread thread2 = new Thread(volatileThread);

        System.out.println("线程1：");
        thread1.start();

        System.out.println("线程2：");
        thread2.start();

    }

    public static void main(String[] args) {

        Thread3 volatileKeywordSynchronization = new Thread3();

        volatileKeywordSynchronization.userVolatileThread();
    }

}
