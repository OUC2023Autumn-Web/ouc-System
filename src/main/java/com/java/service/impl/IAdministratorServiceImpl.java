package com.java.service.impl;

import com.java.dao.CourseDao;
import com.java.dao.StudentDao;
import com.java.model.Course;
import com.java.service.IAdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class IAdministratorServiceImpl implements IAdministratorService {
    @Autowired
    private CourseDao courseDao;
    @Override
    public ArrayList<Course> getAll() {
        return courseDao.getAll();
    }

    @Override
    public void putcourse(Course course) {
        course.setNumber("104");
        courseDao.putcourse(course);
        courseDao.putcourse1(course);
        courseDao.putcourse2(course);
    }

    @Override
    public void deletecourse(Course course) {
        courseDao.deletecourse(course);
        courseDao.deletecourse1(course);
    }
}
