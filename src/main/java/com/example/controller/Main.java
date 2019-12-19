package com.example.controller;

/**
 * @author liuqi
 * @Title: Main
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/9/121:35
 */
public class Main {
    static int value = 33;

    public static void main(String[] args) throws Exception{
        new Main().printValue();
    }

    private void printValue(){
        int value = 3;
        System.out.println(this.value);
    }

    static class MainStudent{
        static int i= 32;
    }
}
