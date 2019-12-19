package com.example.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuqi
 * @Title: ListYuan
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/4/2615:16
 */
public class ListYuan {
    public static void text(){
        List<Integer> list =new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.print(list);
    }

    public static void test(){
        Singleton singleton=Singleton.getInstance();
    }

    public static void main(String[] args) {
        text();
    }
}
