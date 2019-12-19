package com.example.controller;

import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

/**
 * @author liuqi
 * @Title: JsonTest
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/9/317:29
 */
public class JsonTest {
    public static void main(String[] args) throws JSONException {
        //创建JSONObject对象
        JSONObject json = new JSONObject();

        //向json中添加数据
        json.put("username", "wanglihong");
        json.put("height", 12.5);
        json.put("age", 24);

        //创建JSONArray数组，并将json添加到数组
        JSONArray array = new JSONArray();
        array.put(json);

        //转换为字符串
        String jsonStr = array.toString();

        System.out.println(jsonStr);
    }
}
