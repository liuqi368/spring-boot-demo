package com.example.controller;

import com.example.model.UserEntity;
import com.example.ws.WebSocketServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

/**
 * @author liuqi
 * @Title: TestSocketController
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/5/309:25
 */
@Controller
@RequestMapping("/checkCenter")
public class TestSocketController {

    //页面请求
    @GetMapping("/socket/{cid}")
    public ModelAndView socket(@PathVariable String cid) {
        ModelAndView mav=new ModelAndView("/socket");
        mav.addObject("cid", cid);
        return mav;
    }

    //推送数据接口
    @RequestMapping("/socket/push/{cid}")
    public ModelAndView pushToWeb(@PathVariable String cid, String message) {
        ModelAndView mav=new ModelAndView("/socket");
        try {
            WebSocketServer.sendInfo(message,cid);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mav;
    }

}
