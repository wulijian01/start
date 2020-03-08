package com.dand.start.controller;

import com.dand.start.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HealthController {

    @PostMapping("/login2")
    @ResponseBody
    public String health(User user){
        System.out.println(user.getUsername());
        return "success!!";
    }

    @GetMapping("/")
    public String login(){
        return "login";
    }
}
