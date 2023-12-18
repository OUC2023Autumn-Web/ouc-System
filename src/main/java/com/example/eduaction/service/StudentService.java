package com.example.eduaction.service;

import com.example.eduaction.pojo.Course;
import com.example.eduaction.pojo.Json;
import com.example.eduaction.pojo.SelectedCourse;

import java.util.ArrayList;

public interface StudentService {
    ArrayList<SelectedCourse> listSelectedCourses(String username);

    ArrayList<Course> listCourses();

    void deleteCourse(String username, String number);

    Integer putCourse(String username, String number);

    void getALLtime(Json[] arr);
}
