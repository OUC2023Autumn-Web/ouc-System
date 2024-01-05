package com.java.controller;

import com.java.model.Course;
import com.java.model.StudentInstances.StuInstance1;
import com.java.model.StudentInstances.StuInstance2;
import com.java.model.StudentInstances.StuInstance3;
import com.java.model.dayEnum;
import com.java.service.impl.IStudentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

import static org.codehaus.jackson.map.type.TypeFactory.type;

/**
 * @author Mango
 */
@Slf4j
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    public IStudentServiceImpl studentService;
    //@GetMapping("/findAll")
    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public ArrayList<StuInstance1> findAll(String username){
        log.info("查询学生学过的所有课程");
        ArrayList<StuInstance1> courses = studentService.findAll(username);
        return courses;
    }
    //@GetMapping("/getSome")
    @RequestMapping(value = "/getSome",method = RequestMethod.GET)
    public ArrayList<Course> getSome(String name){
        log.info("查询可选课程");
        ArrayList<Course> courses;
        if(name.equals("all")){
            courses = studentService.getAll();
        }
        else{
            courses = studentService.getSome(name);
        }
        return  courses;
    }
    //@DeleteMapping("/delete")
    @RequestMapping("/delete")
    public void deleteCourse(@RequestBody StuInstance3 body){
        log.info("删除学生对应的课程");
        studentService.deleteCourse(body.username, body.number);
        log.info("删除成功");
    }
    //@PutMapping("/put")
    @RequestMapping(value = "/put",method = RequestMethod.PUT)
    public Integer putCourse(@RequestBody StuInstance3 body){
        log.info("添加课程");
        int t = studentService.putCourse(body.username,body.number);
        return t;
    }
    //@GetMapping("/getAlltime")
    @RequestMapping(value = "/getAlltime",method = RequestMethod.GET)
    public StuInstance2[] getAlltime(String username){
        log.info("课程表");
        StuInstance2[] arr = new StuInstance2[12];
        arr = studentService.getALLtime(username);
        return arr;
    }
}
