package com.dand.start.controller;


import com.dand.start.entity.Wwf;
import com.dand.start.service.WwfService;
import com.dand.start.vo.WwfVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WwfController {
    @Autowired
    private WwfService wwfService;

    @PostMapping("/login3")
    public Wwf geta(WwfVo vo){
        Wwf wwf1 = wwfService.getb(vo);
        return wwf1;
    }
}
