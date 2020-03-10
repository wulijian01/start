package com.dand.start.controller;

import com.dand.start.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void test(){
        userService.test();
    }

    public void test2(){
        userService.test();
    }
}
