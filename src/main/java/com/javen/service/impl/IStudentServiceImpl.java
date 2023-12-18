package com.javen.service.impl;

import com.javen.dao.StudentDao;
import com.javen.model.Student;
import com.javen.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mango
 */
@Service
public class IStudentServiceImpl implements IStudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public List<Student> findByName(Student student) {
        return studentDao.findByName(student);
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentDao.getStudentById(id);
    }

    @Override
    public Integer addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    @Override
    public Integer deleteStudent(Student student) {
        return studentDao.deleteStudent(student);
    }

    @Override
    public Integer updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }
}
