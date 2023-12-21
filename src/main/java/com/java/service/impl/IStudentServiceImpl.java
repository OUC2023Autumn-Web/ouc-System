package com.java.service.impl;

import com.java.model.Course;
import com.java.model.StudentInstances.StuInstance1;
import com.java.model.StudentInstances.StuInstance2;
import com.java.service.IStudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author Mango
 */
@Service
public class IStudentServiceImpl implements IStudentService {


    @Override
    public ArrayList<StuInstance1> findAll(String username) {
        return null;
    }

    @Override
    public ArrayList<Course> getSome(String name) {
        return null;
    }

    @Override
    public void deleteCourse(String username, String number) {

    }

    @Override
    public int putCourse(String username, String number) {
        return 0;
    }

    @Override
    public void getALLtime(StuInstance2[] arr, String username) {

    }
}
