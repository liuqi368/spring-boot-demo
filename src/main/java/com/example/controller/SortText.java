package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author liuqi
 * @Title: SortText
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/3/2810:21
 */
public class SortText {

    public static void main(String[] args) {
        bubbleSort01();
    }

    public static void  sort(){
        String ch = "hnkosniqofoamlcajfionrglko";
        List list = new ArrayList();
        System.out.println(ch.length());
        for (int i = 0; i < ch.length(); i++) {
            String st = ch.substring(i, i + 1);
            list.add(st);
        }
        java.util.Collections.sort(list);
        System.out.println("排序前的字母为：" + ch);
        System.out.println("排序后的字母为：" + list);
    }
    public static void bubbleSort01() {
        int[] numbers={1,2,3,323,23,4324,54,654,654,6,56644,56,466,476,7,8,886,5,35345};
        int temp;
        int size = numbers.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] < numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for(int aa : numbers) System.out.print(aa+",");
    }
}
