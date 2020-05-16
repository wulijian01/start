package com.dand.start.controller;


import com.dand.start.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HealthController {

    @GetMapping("/index1")
    public String login(Model model){

        return "index";
    }
}
