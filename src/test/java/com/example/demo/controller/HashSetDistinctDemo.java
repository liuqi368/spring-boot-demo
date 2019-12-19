package com.example.demo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

/**
 * @author liuqi
 * @Title: HashSetDisDemo
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/11/2219:28
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HashSetDistinctDemo {

    @Test
    public void test(){

        //LinkedHashSet去重（保持原有的顺序）
        String[] arr = new String[] {"i", "think", "i", "am", "the", "best"};
        Collection<String> noDups = new LinkedHashSet<String>(Arrays.asList(arr));
        System.out.println("(LinkedHashSet) distinct words:    " + noDups);

        //HashSet去重一（不保持原有的顺序）
        Collection<String> HS = new HashSet<String>(Arrays.asList(arr));
        System.out.println("(HashSet) distinct words:" + HS);

        //HashSet去重二（不保持原有的顺序）
        Set<String> s = new HashSet<String>();
        for (String a : arr) {
            if (!s.add(a)){
                System.out.println("Duplicate detected: " + a);
            }
        }
        System.out.println(s.size() + " distinct words: " + s);

        //HashSet去重三（不保持原有的顺序）
        Set<String> uniques = new HashSet<String>();
        Set<String> dups = new HashSet<String>();
        for (String a : arr) {
            if (!uniques.add(a))
                dups.add(a);
        }
        uniques.removeAll(dups);
        System.out.println("Unique words:    " + uniques);
        System.out.println("Duplicate words: " + dups);
    }
}
