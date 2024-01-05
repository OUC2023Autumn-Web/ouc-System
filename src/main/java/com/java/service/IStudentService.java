package com.java.service;

import com.java.model.Course;
import com.java.model.StudentInstances.StuInstance1;
import com.java.model.StudentInstances.StuInstance2;

import java.util.ArrayList;

/**
 * @author Mango
 */
public interface IStudentService {

    ArrayList<StuInstance1> findAll(String username);

    ArrayList<Course> getSome(String name);

    ArrayList<Course> getAll();

    void deleteCourse(String username, String number);

    int putCourse(String username, String number);


    StuInstance2[] getALLtime(String username);
}
