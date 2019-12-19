package com.example.demo.controller;

import com.example.model.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author liuqi
 * @Title: SortListDemoList
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/11/2212:10
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SortListDemoListTest {

    /**
     * list的排序的方式
     */
    @Test
    public void sort(){

        List<UserEntity> list = new ArrayList<UserEntity>();
        list.add( new UserEntity(1,"ming","ming"));
        list.add( new UserEntity(2,"qing","qing"));
        list.add( new UserEntity(3,"ling","ling"));

        Collections.sort(list, new Comparator<UserEntity>() {
            @Override
            public int compare(UserEntity o1, UserEntity o2) {
                int diff = o2.getId() - o1.getId();
                if(diff > 0){
                    return 1;//大于
                }else if(diff < 0){
                    return -1;//小于
                }else{
                    return 0;//等于
                }
            }
        });
        System.out.println(list.toString());
    }

    /**
     * list去重
     */
    @Test
    public void duplicate(){

        //1. List双重循环去重
        String[] array = {"a","b","c","c","d","e","e","e","a"};
        /*List<String> result = new ArrayList<>();
        boolean flag;
        for(int i=0; i<array.length;i++){
            flag = false;
            for(int j=0;j<result.size();j++){
                if(array[i].equals(result.get(j))){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                result.add(array[i]);
            }
        }
        result.stream().forEach(System.out::print);*/

        //2. 使用indexOf方法进行判断结果集中是否存在了数组元素去重
        List<String> list = new ArrayList<>();
        /*list.add(array[0]);
        for(int i=0;i<array.length;i++){
            if(list.toString().indexOf(array[i])==-1){
                list.add(array[i]);
            }
        }
        list.stream().forEach(System.out::print);*/

        //3. 嵌套循环去重
        /*for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] == array[j]){
                    j = ++i;
                }
            }
            list.add(array[i]);
        }
        list.stream().forEach(System.out::print);*/

        //4. sort排序，相邻比较去重
        /*Arrays.sort(array);
        list.add(array[0]);
        for(int i=1;i<array.length;i++){
            if(!array[i].equals(list.get(list.size()-1))){
                list.add(array[i]);
            }
        }
        list.stream().forEach(System.out::print);*/

        //5. set方法无需排列去重
        Set<String> set = new HashSet();
        for(int i=0;i<array.length;i++){
            set.add(array[i]);
        }
        list.addAll(set);
        list.stream().forEach(System.out::print);

        //遍历list的3中方式
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
    }
}
