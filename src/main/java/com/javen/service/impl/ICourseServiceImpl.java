package com.javen.service.impl;

import com.javen.dao.CourseDao;
import com.javen.model.Course;
import com.javen.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mango
 * @date 2022/12/05 21:56
 */
@Service
public class ICourseServiceImpl implements ICourseService {
    @Autowired
    private CourseDao courseDao;
    @Override
    public List<Course> findAll() {
        return courseDao.findAll();
    }

    @Override
    public List<Course> findSelect(Integer id) {
        return courseDao.findSelect(id);
    }

    @Override
    public List<Course> findByName(Course course) {
        return courseDao.findByName(course);
    }

    @Override
    public Integer addCourse(Course course) {
        return courseDao.addCourse(course);
    }

    @Override
    public Integer deleteCourse(Course course) {
        return courseDao.deleteCourse(course);
    }

    @Override
    public Integer updateCourse(Course course) {
        return courseDao.updateCourse(course);
    }

    @Override
    public Integer selectCourse(Course course) {
        return courseDao.selectCourse(course);
    }
}
