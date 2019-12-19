package com.example.service.impl;

import com.example.service.TestService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuqi
 * @Title: TestTwoServiceImpl
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/5/2914:09
 */
@Service(value= "testTwoService")
public class TestTwoServiceImpl implements TestService{

    @Override
    public Map<String, Object> queryList() {
        Map map=new HashMap();
        map.put("name","chengnig");
        return map;
    }
}
