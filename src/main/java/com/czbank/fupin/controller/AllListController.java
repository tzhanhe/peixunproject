package com.czbank.fupin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class AllListController {
    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll(){

        return "ok";
    }
}
