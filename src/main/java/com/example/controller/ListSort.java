package com.example.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuqi
 * @Title: ListSort
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/9/69:26
 */
public class ListSort {
    public static void testList(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.stream().forEach(System.out::println);
        list.stream().distinct().forEach(System.out::println);
    }

    public static void main(String[] args) {
        testList();
    }
}
