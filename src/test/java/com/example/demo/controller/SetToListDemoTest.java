package com.example.demo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

/**
 * @author liuqi
 * @Title: SetToListDemoTest
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/11/2219:20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SetToListDemoTest {

    @Test
    public void test(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("ele1", "小樱");
        map.put("ele2", "若曦");
        map.put("ele3", "晴川");
        Set<String> set = map.keySet();

        //ArrayList进行转换
        //List<String> list = new ArrayList<String>(set);
        //list.stream().forEach(System.out::print);

        List<String> list = new ArrayList<String>();
        list.addAll(set);
        list.stream().forEach(System.out::print);
    }
}
