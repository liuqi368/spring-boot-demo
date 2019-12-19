package com.example.controller;

import com.example.model.UserEntity;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author liuqi
 * @Title: TesxController
 * @ProjectName spring-boot-demo
 * @Description: TODO
 * @date 2018/12/410:20
 */
@Controller
@RequestMapping("lambda")
public class LambdaController {

    /**
     * 遍历list
     */
    @RequestMapping("lambda")
    public static void lambda(){
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);
        players.forEach((player)->System.out.print(player+";"));
        players.forEach(System.out::println);
    }

    public static void user(){
        List<UserEntity> userList = new ArrayList();

        UserEntity user1 = new UserEntity(1, "张三", "zhangsan");
        UserEntity user2 = new UserEntity(2, "李四", "lisi");
        UserEntity user3 = new UserEntity(3, "王五", "wangwu");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        //List<UserEntity> goodsIds = userList.stream().map(UserEntity::getName).collect(Collectors.toList());
        List<UserEntity> jji=userList.stream().filter(user-> user.getName().equals("lisi")).collect(Collectors.toList());
        jji.forEach(user ->{
            System.out.println(user.getId());
        });
    }
    public static void fore(){
        //new Thread2(() -> System.out.println("Hello World!"));

        String ji="kkkkkkk,pppp,ooo";
        //切割字符串后转变为list集合
        //List seriesIds = Arrays.asList(ji.split(",")).stream().map(s ->s.trim()).collect(Collectors.toList());
        //seriesIds.forEach(System.out::println);
        List seriesIds = Arrays.asList(ji.split(",")).stream().filter(s ->!s.equals("ooo")).collect(Collectors.toList());
        seriesIds.stream().forEach(System.out::println);
    }

    public static void maps(){
        //扁平化处理
        Stream<List<Integer>> inputStream = Stream.of(
                Arrays.asList(1),
                Arrays.asList(2, 3),
                Arrays.asList(4, 5, 6)
        );
        Stream<Integer> outputStream = inputStream.
                flatMap((childList) -> childList.stream());
    }


    public static void  fiter(){

    }

    public static void time(){
        LambdaController tester = new LambdaController();

        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;

        // 不用类型声明
        MathOperation subtraction = (a, b) -> a - b;

        // 大括号中的返回语句
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        // 不用括号
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        // 用括号
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }

    public void list2(){
        List<String> list1 = new ArrayList();
        List<String> list2 = new ArrayList();
        list1.add("1");
        list1.add("2");
        list1.add("3");

        list2=list1.stream().map(string ->{return string+"34";}).collect(Collectors.toList());

        list2 = list1.stream().map(string -> {
            return "stream().map()处理之后：" + string;
        }).collect(Collectors.toList());

        list2.stream().forEach(string -> {
            System.out.println(string);
        });
    }

    public static void list3(){

        UserEntity user1 = new UserEntity(1, "张三", "zhangsan");
        UserEntity user2 = new UserEntity(2, "李四", "lisi");
        UserEntity user3 = new UserEntity(3, "王五", "wangwu");

        List<UserEntity> list1 = new ArrayList();
        List<UserEntity> list2 = new ArrayList();

        list1.add(user1);
        list1.add(user2);
        list1.add(user3);


        list1=list1.stream().map(userEntity ->{
            UserEntity userEntity2=new UserEntity();
            userEntity2.setName(userEntity.getName()+",");
            return  userEntity2;
        }).collect(Collectors.toList());

        list1.stream().forEach(s -> System.out.print(s.getName()));
    }

    public static void sum(){
        // 用所有不同的数字创建一个正方形列表
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> distinct = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
        System.out.printf("Original List : %s,  Square Without duplicates : %s %n", numbers, distinct);



    }

    public static void avg(){
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Highest prime number in List : " + stats.getMax());
        System.out.println("Lowest prime number in List : " + stats.getMin());
        System.out.println("Sum of all prime numbers : " + stats.getSum());
        System.out.println("Average of all prime numbers : " + stats.getAverage());

    }


    public static void pachong() throws IOException {
        Document doc = Jsoup.connect("http://search.qyer.com/index/93960_1.html").get();
        String title = doc.title();
        System.out.print(title);

        //Element content = doc.getElementById("content");
        Elements ul = doc.getElementsByAttribute("p");
        //Elements links = content.getElementsByTag("a");
        for (Element link : ul) {

            String linkText = link.text();
            System.out.print(linkText);
        }

    }



    public static void containsKey(){
        Map map =new HashMap<>();
        map.put("time","2019-03-21");
        map.put("name","小猫");
        map.remove("time");
        boolean empty = map.isEmpty();
        boolean time = map.containsKey("time");
        System.out.print(empty);
    }


    @RequestMapping("operation")
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
}
