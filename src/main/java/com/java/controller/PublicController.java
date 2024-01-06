package com.java.controller;

import com.java.model.User;
import com.java.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Slf4j
@RestController
public class PublicController {
    @Autowired
    public IUserService userService;
    //@PutMapping("/repassword")
    @RequestMapping(value = "/repassword",method = RequestMethod.PUT)
        public void repassword(@RequestBody User user){
        log.info("修改密码");
        userService.repassword(user);
    }
    //@GetMapping("/information")
    @RequestMapping(value = "/get_information",method = RequestMethod.POST)
    public User getinformation(@RequestBody User user){
        log.info("获得个人信息");
        return userService.getinformation(user);
    }
    //@PutMapping("/information")
    @RequestMapping(value = "/re_information",method = RequestMethod.PUT)
    public void setinformation(@RequestBody User user){
        log.info("/修改个人信息");
        userService.setinformation(user);

    }
}
