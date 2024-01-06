package com.java.controller;

import com.java.model.Course;
import com.java.service.IUserService;
import com.java.service.impl.IAdministratorServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Slf4j
@RestController
@RequestMapping("/managers")
public class Administrator {
    @Autowired
    public IAdministratorServiceImpl administratorService;

    //@GetMapping("/getAll")
    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public ArrayList<Course> getAll(){
        log.info("已有课程预览");
        return administratorService.getAll();
    }

    //@PutMapping("/putcourse")
    @RequestMapping(value = "/putcourse",method = RequestMethod.PUT)
    public void putcourse(@RequestBody Course course){
        log.info("添加课程");
        administratorService.putcourse(course);
    }

    //@DeleteMapping("/Deletecourse")
    @RequestMapping(value = "/Deletecourse",method = RequestMethod.DELETE)
    public void deletecourse(@RequestBody Course course){
        log.info("删除课程");
        administratorService.deletecourse(course);
    }


}
