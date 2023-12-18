package com.javen.service;

import com.javen.model.Student;

import java.util.List;

/**
 * @author Mango
 */
public interface IStudentService {
    /**
     * 查询所有学生
     *
     * @return 学生列表
     */
    List<Student> findAll();

    /**
     * 根据项姓名查询学生
     *
     * @param student 学生
     * @return 学生
     */
    List<Student> findByName(Student student);

    /**
     * 根据id查询学生
     *
     * @param id 学生id
     * @return 学生
     */
    Student getStudentById(Integer id);

    /**
     * 新增学生
     *
     * @param student 学生
     * @return 新增情况
     */
    Integer addStudent(Student student);

    /**
     * 删除学生
     *
     * @param student 学生
     * @return 更新情况
     */
    Integer deleteStudent(Student student);

    /**
     * 更新学生
     *
     * @param student 学生
     * @return 更新情况
     */
    Integer updateStudent(Student student);
}
