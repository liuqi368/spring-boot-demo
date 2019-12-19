package com.example.service.impl;

import com.example.dao.ExampleTableMapper;
import com.example.model.ExampleTable;
import com.example.service.ExampleTableService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author liuqi
 * @Title: ExampleTableServiceImpl
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/5/3118:10
 */
@Service("exampleTableService")
@ComponentScan(basePackages={"com.example.dao"})
public class ExampleTableServiceImpl implements ExampleTableService {

    @Resource
    private ExampleTableMapper exampleTableMapper;

    @Override
    public List<ExampleTable> queryLists(ExampleTable exampleTable) {
        List<ExampleTable> exampleTables = exampleTableMapper.queryLists(exampleTable);
        exampleTables.forEach(table->System.out.print(table.getAge()));
        exampleTables.stream().filter(table->table.getId().equals("2")).collect(Collectors.toList());
        exampleTables.forEach(System.out::println);
        Map<String, List<ExampleTable>> employeesByOffice = exampleTables.stream().collect(Collectors.groupingBy(ExampleTable::getOffice));
        System.out.println(employeesByOffice);

        Map<String, Long> employeesByCity = exampleTables.stream().collect(Collectors.groupingBy(ExampleTable::getOffice, Collectors.counting()));
        System.out.println(employeesByCity);

        Map<String, Double> employeesAvg = exampleTables.stream().collect(Collectors.groupingBy(ExampleTable::getOffice, Collectors.averagingInt(ExampleTable::getAge)));
        System.out.println(employeesAvg);

        Map<String, Long> employeesBySum = exampleTables.stream().collect(Collectors.groupingBy(ExampleTable::getOffice, Collectors.summingLong(ExampleTable::getAge)));
        System.out.println(employeesBySum);

        Map<String, Long> finalMap = new LinkedHashMap<>();
        employeesBySum.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
        System.out.println(finalMap);

        List<String> findOffice=exampleTables.stream().map(ExampleTable::getOffice).collect(Collectors.toList());
        List<String> groupOffice=findOffice.stream().distinct().collect(Collectors.toList());
        groupOffice.forEach(System.out::println);

        List<ExampleTable> unique = exampleTables.stream().collect(
                Collectors.collectingAndThen(Collectors.toCollection(
                        () -> new TreeSet<>(Comparator.comparing(o -> o.getOffice()))), ArrayList::new));
        unique.forEach(System.out::println);

        return exampleTables;
    }
}
