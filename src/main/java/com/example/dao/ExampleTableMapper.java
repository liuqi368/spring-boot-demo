package com.example.dao;

import com.example.model.ExampleTable;

import java.util.List;

public interface ExampleTableMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(ExampleTable record);

    int insertSelective(ExampleTable record);

    ExampleTable selectByPrimaryKey(Integer id);

    List<ExampleTable> queryLists(ExampleTable record);

    int updateByPrimaryKeySelective(ExampleTable record);

    int updateByPrimaryKey(ExampleTable record);
}