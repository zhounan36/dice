package com.zhou.dice.controller;

import com.alibaba.fastjson.JSONObject;
import com.zhou.dice.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommenCL {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("login")
    public String login(){
        return "login";
    }

    @PostMapping("login")
    public JSONObject CheckLogin(){
        JSONObject jsonObject=new JSONObject();






        return jsonObject;
    }




}
