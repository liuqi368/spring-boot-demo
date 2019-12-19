package com.example.controller;

import com.example.model.ExampleTable;
import com.example.service.ExampleTableService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liuqi
 * @Title: ExampleTableController
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/5/3118:07
 */
@RestController
@RequestMapping("exampleTable")
public class ExampleTableController {

    @Resource
    private ExampleTableService exampleTableService;

    @RequestMapping("queryLists")
    public List<ExampleTable> queryLists(){
        ExampleTable exampleTable=new ExampleTable();
        //exampleTable.setId(1);
        List<ExampleTable> exampleTables = exampleTableService.queryLists(exampleTable);
        return exampleTables;
    }
}
