package com.example.controller;

/**
 * @author liuqi
 * @Title: ArrayListText
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/4/316:09
 */
public class ArrayListText {
        // 版本号
        private static final long serialVersionUID = 8683452581122892189L;
        // 缺省容量   默认的初始值就是10
        private static final int DEFAULT_CAPACITY = 10;
        // 空对象数组
        private static final Object[] EMPTY_ELEMENTDATA = {};
        // 缺省空对象数组
        private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
        // 元素数组
        transient Object[] elementData;
        // 实际元素大小，默认为0
        private int size;
        // 最大数组容量
        private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;


}
