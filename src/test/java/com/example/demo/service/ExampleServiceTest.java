package com.example.demo.service;

import com.example.dao.ExampleTableMapper;
import com.example.model.ExampleTable;
import com.example.service.ExampleTableService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author liuqi
 * @Title: ExampleServiceTest
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/6/39:35
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class ExampleServiceTest {

    @Resource
    private ExampleTableService exampleTableService;

    @Test
    public void queryLists() {
        ExampleTable exampleTable=new ExampleTable();
        List<ExampleTable> exampleTables = exampleTableService.queryLists(exampleTable);
        exampleTables.forEach(table->System.out.print(table.getAge()));
        exampleTables.stream().filter(table->table.getId().equals("2")).collect(Collectors.toList());
        exampleTables.forEach(System.out::println);
        /*Map<String, List<ExampleTable>> employeesByCity = exampleTables.stream().collect(Collectors.groupingBy(ExampleTable::getOffice));

        System.out.println(employeesByCity);*/
    }
}
