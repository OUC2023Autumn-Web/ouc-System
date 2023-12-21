package com.java.service.impl;

import com.java.model.Course;
import com.java.model.Student;
import com.java.model.TeaInstances.TeaInstance1;
import com.java.model.TeaInstances.TeaInstance3;
import com.java.service.ITeacherService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author Mango
 * @date 2022/12/05 21:22
 */
@Service
public class ITeacherServiceImpl implements ITeacherService {


    @Override
    public ArrayList<Course> findAll(String username) {
        return null;
    }

    @Override
    public ArrayList<TeaInstance1> getStudent(String username, String time) {
        return null;
    }

    @Override
    public ArrayList<Student> getStudent2(String username, String time) {
        return null;
    }

    @Override
    public void setscore(TeaInstance3 body) {

    }
}
