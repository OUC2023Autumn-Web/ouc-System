package com.java.dao;

import com.java.model.Course;
import com.java.model.StudentInstances.StuInstance1;
import com.java.model.TeaInstances.TeaInstance1;
import com.java.model.TeaInstances.TeaInstance3;
import com.java.model.TeaInstances.TeaInstance4;
import com.java.model.Teacher;

import java.util.ArrayList;

/**
 * @author Mango
 * @date 2022/12/05 21:12
 */
public interface TeacherDao {
    ArrayList<Course> findAll(Teacher tea1);
    ArrayList<TeaInstance1> getStudent(Course cou);

    void setscore(TeaInstance4 body);
}
