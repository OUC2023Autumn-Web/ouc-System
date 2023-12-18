package com.javen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.ws.rs.GET;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public Integer login(){
        return 1;
    }
}
