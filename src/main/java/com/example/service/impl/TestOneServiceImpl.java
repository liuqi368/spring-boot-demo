package com.example.service.impl;

import com.example.service.TestService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuqi
 * @Title: TestServiceImpl
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/5/2913:53
 */
@Service(value = "testOneService")
public class TestOneServiceImpl implements TestService{

    @Override
    public Map<String, Object> queryList() {
        Map map=new HashMap();
        map.put("name","linian");
        return map;
    }
}
