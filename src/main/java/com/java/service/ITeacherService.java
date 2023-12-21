package com.java.service;

import com.java.model.Course;
import com.java.model.Student;
import com.java.model.TeaInstances.TeaInstance1;
import com.java.model.TeaInstances.TeaInstance3;

import java.util.ArrayList;

/**
 * @author Mango
 * @date 2022/12/05 21:20
 */
public interface ITeacherService {

    ArrayList<Course> findAll(String username);

    ArrayList<TeaInstance1> getStudent(String username, String time);

    ArrayList<Student> getStudent2(String username, String time);

    void setscore(TeaInstance3 body);
}
