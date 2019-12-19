package com.example.demo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author liuqi
 * @Title: MapIteratorDemoTest
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/11/2221:49
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MapIteratorDemoTest {

    @Test
    public void test(){
        Map<String,Object> map =new HashMap();
        map.put("1","xiMing");
        map.put("2","liNing");
        map.put("3","liSan");

        //用for循环来进行遍历
        for(Map.Entry<String,Object> entry : map.entrySet()){
            System.out.println(entry.getKey()+"--->"+entry.getValue());
        }

        //用Iterator进行遍历
        Set set = map.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry<String, String> next = (Map.Entry<String, String>)it.next();
            System.out.println(next.getKey() + "；" + next.getValue());
        }

        //用KeySet进行遍历
        Iterator<String> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            String key = iterator.next().toString();
            String value = map.get(key).toString();
            System.out.println("key:"+key+";value:"+value);

        }
    }
}
