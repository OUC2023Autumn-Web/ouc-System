package com.java.dao;

import com.java.model.Course;
import com.java.model.Student;
import com.java.model.StudentInstances.StuInstance1;

import java.util.ArrayList;

/**
 * @author Mango
 * @date 2022/12/05 21:55
 */
public interface CourseDao {
    ArrayList<Course> getAll();

    void deletecourse(Course course);

    void putcourse(Course course);

    void putcourse1(Course course);

    void putcourse2(Course course);

    void deletecourse1(Course course);
    /**
     * 查询所有课程
     *
     * @return 课程列表
     */
}
