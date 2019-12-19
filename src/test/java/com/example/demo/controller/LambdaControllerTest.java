package com.example.demo.controller;

import com.example.controller.LambdaController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.Cache;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liuqi
 * @Title: LambdaControllerTest
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/5/2215:07
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LambdaControllerTest {

    private static final HashMap map=new HashMap();
    @Test
    public void testOperation() throws Exception{
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);
        players.forEach((player)->System.out.print(player+";"));
        players.forEach(System.out::println);
    }

    @Test
    public void testList(){
        List<Integer> list =new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.forEach(integer -> System.out.println(integer+";"));
    }

    public void testMaxList(){}

    @Test
    public void operation(){
        int a = 60;
        int b = 13;
        int c = 0;
        c = a & b;
        System.out.println("a & b = " + c );
        c = a | b;
        System.out.println("a | b = " + c );
        c = a ^ b;
        System.out.println("a ^ b = " + c );
        c = ~a;
        System.out.println("~a = " + c );
        c = a << 2;
        System.out.println("a << 2 = " + c );
        c = a >> 2;
        System.out.println("a >> 2  = " + c );
        c = a >>> 2;
        System.out.println("a >>> 2 = " + c );
    }

    @Test
    public void find(){

        for(int i = 0; i<10; i++) {
            final int x=i;
            Thread t = new Thread(
                    () -> System.out.println("The answer is: " + x)
            );
        }


    }

    @Test
    public void list2(){
        List<String> list1 = new ArrayList<String>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("5");
        list1.add("6");

        List<String> list2 = new ArrayList<String>();
        list2.add("2");
        list2.add("3");
        list2.add("7");
        list2.add("8");

        // 交集
        List<String> intersection = list1.stream().filter(item -> list2.contains(item)).collect(Collectors.toList());
        System.out.println("---交集 intersection---");
        intersection.parallelStream().forEach(System.out :: println);

        // 差集 (list1 - list2)
        List<String> reduce1 = list1.stream().filter(item -> !list2.contains(item)).collect(Collectors.toList());
        System.out.println("---差集 reduce1 (list1 - list2)---");

        reduce1.parallelStream().forEach(System.out :: println);

        map.put("jjj",323);

        System.out.println(map.get("jjj"));

    }

    @Test
    public void list3(){
        String[] array = {"a","b","c","d","a","b"};
        List<String> list = new ArrayList<>();
        boolean flag;

        for(int i=0; i<array.length; i++){
            flag = true;
            for(int j=0; j<list.size();j++){
                if (array[i].equals(list.get(j))){
                    flag = false;
                    break;
                }
            }
            if (flag){
                list.add(array[i]);
            }
        }
        String[] newArray=list.toArray(new String[list.size()]);
        list.stream().forEach(System.out::println);
    }

    @Test
    public void list4(){
        String[] array = {"a","b","c","c","d","e","e","e","a"};
        List<String> list = new ArrayList<>();
        list.add(array[0]);
        for(int i=1;i<array.length;i++){
            if(list.toString().indexOf(array[i]) == -1){
                list.add(array[i]);
            }
        }
        String[] arrayResult = (String[]) list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(arrayResult));
    }
}
