package com.java.controller;

import com.java.model.Login.LogInstance;
import com.java.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LoginController {
    @Autowired
    public IUserService userService;
    @GetMapping ("/login")
    public Integer login(@RequestBody LogInstance body){

       return userService.login(body.username,body.identity,body.password);
    }
}
