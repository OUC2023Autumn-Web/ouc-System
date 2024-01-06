package com.java.service.impl;

import com.java.dao.StudentDao;
import com.java.dao.TeacherDao;
import com.java.model.Course;
import com.java.model.Student;
import com.java.model.TeaInstances.TeaInstance1;
import com.java.model.TeaInstances.TeaInstance3;
import com.java.model.TeaInstances.TeaInstance4;
import com.java.model.Teacher;
import com.java.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author Mango
 * @date 2022/12/05 21:22
 */
@Service
public class ITeacherServiceImpl implements ITeacherService {
    @Autowired
    private TeacherDao teacherDao;

    @Override
    public ArrayList<Course> findAll(String username) {
        Teacher tea1 = new Teacher();
        tea1.username=username;
        return teacherDao.findAll(tea1);
    }

    @Override
    public ArrayList<TeaInstance1> getStudent(String username, String time) {
        Course cou = new Course();
        cou.setTeacher(username);
        cou.setTime(time);
        return teacherDao.getStudent(cou);
    }

    @Override
    public ArrayList<Student> getStudent2(String username, String time) {
        return null;
    }

    @Override
    public void setscore(TeaInstance3 body) {
        TeaInstance4 tea4 = new TeaInstance4();
        tea4.course_name=body.course_name;
        for(int i=0;i<body.students.size();i++){
            tea4.username= body.students.get(i).username;
            tea4.score= body.score.get(i);
            teacherDao.setscore(tea4);
        }
    }
}
