package com.example.utils;

/**
 * @author liuqi
 * @Title: Text
 * @ProjectName spring-boot-demo
 * @Description: TODO
 * @date 2019/2/1514:05
 */
public class Text {

    Singleton singleton=Singleton.getInstance();

    private void main(){
        singleton.getRandomNumberInRange(1,2);
    }


}
