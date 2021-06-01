package com.yinyu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yinyu.annotation.Log;


@Controller
@RequestMapping("userController")
public class UserController {

    @RequestMapping("testAOP")
    @Log(operationType="add操作:",operationName="添加用户")
    public void testAOP(String userName,String password){
        System.out.println("@@@@@@@@  testAOP @@@@@@@@");
    }
}