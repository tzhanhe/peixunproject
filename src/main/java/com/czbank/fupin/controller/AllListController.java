package com.czbank.fupin.controller;

import com.czbank.fupin.mapper.FindMapper;
import com.czbank.fupin.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class AllListController {

    @Autowired
    private FindMapper findMapper;
    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll(){

        User user = findMapper.findAllUsers().get(0);
        return user.toString();
    }
}
