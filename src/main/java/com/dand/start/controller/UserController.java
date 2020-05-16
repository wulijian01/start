package com.dand.start.controller;

import com.dand.start.entity.User;
import com.dand.start.security.jwt.JwtTokenUtil;
import com.dand.start.security.jwt.JwtUser;
import com.dand.start.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @GetMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestParam String username, @RequestParam String password) {

        User user = userService.getUser(username);
        Map<String, String> hashMap = new HashMap();
        if (user != null && password.equals(user.getPassword())) {
            String s = jwtTokenUtil.generateToken(new JwtUser(username, password, null));
            hashMap.put("token", s);
            return new ResponseEntity<Map<String, String>>(hashMap, HttpStatus.OK);
        } else {
            hashMap.put("message", "用户名或者密码不正确！");
            return new ResponseEntity<Map<String, String>>(hashMap, HttpStatus.OK);
        }
    }
}
