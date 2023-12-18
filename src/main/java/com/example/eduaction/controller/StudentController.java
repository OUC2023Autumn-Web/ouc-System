package com.example.eduaction.controller;

import com.example.eduaction.pojo.Course;
import com.example.eduaction.pojo.Json;
import com.example.eduaction.pojo.SelectedCourse;
import com.example.eduaction.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired StudentService studentService;
    @GetMapping("findAll")
    public ArrayList<SelectedCourse> findAll(@RequestParam String username){
        log.info("查询学生所选的所有课程");
        ArrayList<SelectedCourse> courses = studentService.listSelectedCourses(username);
        return courses;
    }
    @GetMapping("/getsome")
    public ArrayList<Course> getCourses(){
        log.info("查询本学期可选的课程");
        ArrayList<Course> courses = studentService.listCourses();
        return courses;
    }
    @DeleteMapping("/delete")
    public void deleteCourse(@RequestParam String username, @RequestParam String number){
        log.info("删除学生对应的课程");
        studentService.deleteCourse( username, number);
        log.info("删除成功");
    }
    @PutMapping("/put")
    public Integer putCourse(@RequestParam String username, @RequestParam String number){
        log.info("添加课程");
        Integer integer = studentService.putCourse(username,number);
        return integer;
    }
    @GetMapping("/getAlltime")
    public Json[] getAlltime(){
        log.info("课程表");
        Json[] arr = new Json[12];
        /*通过service层先得到对应的数据，再对arr进行修改*/
        studentService.getALLtime(arr);
        return arr;
    }


}
