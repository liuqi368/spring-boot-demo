package com.example.service;

import com.example.model.ExampleTable;

import java.util.List;

/**
 * @author liuqi
 * @Title: ExampleTableService
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/5/3118:10
 */
public interface ExampleTableService {

    List<ExampleTable> queryLists(ExampleTable exampleTable);

}
