package com.java.dao;

import com.java.model.Course;
import com.java.model.Student;
import com.java.model.StudentInstances.StuInstance1;
import com.java.model.StudentInstances.StuInstance2;
import com.java.model.StudentInstances.StuInstance3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mango
 */
public interface StudentDao {
    /**
     * 查询所有学生
     *
     * @return 学生列表
     */
    ArrayList<StuInstance1> findAll(Student stu);
    ArrayList<Course> getSome(Course cou);
    ArrayList<Course> getAll();
    void delete(StuInstance3 stu3);

    void putCourse(StuInstance3 stu3);
    ArrayList<StuInstance1> getALLtime(StuInstance3 stu3);
    /**
     * 根据姓名查询学生
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
