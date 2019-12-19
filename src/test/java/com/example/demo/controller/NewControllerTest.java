package com.example.demo.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.annotation.Resource;

/**
 * @author liuqi
 * @Title: NewControllerTest
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/5/2215:32
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class NewControllerTest {

    @Resource
    private MockMvc mockMvc;

    @Test
    public void testOperation() throws Exception{
        String responseString = this.mockMvc.perform(MockMvcRequestBuilders.post("/thymeleaf/tables").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn().getResponse().getContentAsString();
        Assert.assertNotNull("not found",responseString);
        System.out.println("find detail list:"+responseString);
    }

    @Test
    public void i(){
        int i=1;
        i=i++;
        System.out.print(i+"++++++++++++");

    }
}
