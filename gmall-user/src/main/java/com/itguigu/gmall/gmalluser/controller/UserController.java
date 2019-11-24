package com.itguigu.gmall.gmalluser.controller;

import com.itguigu.gmall.gmalluser.bean.user;
import com.itguigu.gmall.gmalluser.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping("getAllUser")
    @ResponseBody
    public  List<user>  getAllUser(){

        List<user> users = userService.getAllUser();
        return null;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }
}
