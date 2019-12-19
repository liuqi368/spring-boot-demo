package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liuqi
 * @Title: NewController
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/5/1417:26
 */
@Controller
@RequestMapping("/thymeleaf")
public class NewController {

    /**
     * login
     * @param model
     * @return
     */
    @RequestMapping(value = "/login")
    public String login(Model model) {
        model.addAttribute("name", "Dear");
        return "login";
    }

    /**
     * index
     * @param model
     * @return
     */
    @RequestMapping(value = "/index")
    public String hello(Model model) {
        return "index";
    }

    /**
     * table
     * @param model
     * @return
     */
    @RequestMapping(value = "/tables")
    public String tables(Model model) {
        return "tables";
    }

    /**
     * charts
     * @param model
     * @return
     */
    @RequestMapping(value = "/charts")
    public String charts(Model model) {
        return "charts";
    }

}
