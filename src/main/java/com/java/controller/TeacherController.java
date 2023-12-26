package com.java.controller;

import com.java.model.Course;
import com.java.model.Student;
import com.java.model.TeaInstances.*;
import com.java.service.impl.ITeacherServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    public ITeacherServiceImpl teacherService;
    //@GetMapping("/getAll")
    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public ArrayList<Course> getAll(String username){
        log.info("查询老师教授的课程");
        ArrayList<Course> courses = teacherService.findAll(username);
        return courses;
    }
    //@GetMapping("/getstudent")
    @RequestMapping(value = "/getstudent",method = RequestMethod.GET)
    public ArrayList<TeaInstance1> getStudent(@RequestBody Map<String,String> body){
        log.info("学生对课程修读情况");
        String username = null;
        String time = null;
        /*实际上map集合中只有一个对象*/
        for (Map.Entry<String, String> entry : body.entrySet()) {
            username = entry.getKey();
            time = entry.getValue();
        }
        ArrayList<TeaInstance1> arrayList = teacherService.getStudent(username, time);
        return arrayList;
    }
    //@GetMapping("/getscore")
    @RequestMapping(value = "/getscore",method = RequestMethod.GET)
    public ArrayList<Student> getStudent(@RequestBody TeaInstance2 body){
        log.info("课程评分");
        ArrayList<Student> arrayList = teacherService.getStudent2(body.username, body.time);
        return arrayList;
    }
    //@PutMapping("/setscore")
    @RequestMapping(value = "/setscore",method = RequestMethod.PUT)
    public void setscore(@RequestBody TeaInstance3 body){
        log.info("课程评分");
        teacherService.setscore(body);

    }
}
