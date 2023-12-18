package com.example.eduaction.service.impl;

import com.example.eduaction.pojo.Course;
import com.example.eduaction.pojo.Json;
import com.example.eduaction.pojo.SelectedCourse;
import com.example.eduaction.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentServiceImpl implements StudentService {

    @Override/*已选的课程查询*/
    public ArrayList<SelectedCourse> listSelectedCourses(String username) {
        return null;
    }

    @Override/*可选的课程查询*/
    public ArrayList<Course> listCourses() {
        return null;
    }

    @Override/*根据用户名和课程号删除对应课程*/
    public void deleteCourse(String username, String number) {

    }

    @Override
    public Integer putCourse(String username, String number) {

        return null;
    }

    @Override
    public void getALLtime(Json[] arr) {

    }
}
