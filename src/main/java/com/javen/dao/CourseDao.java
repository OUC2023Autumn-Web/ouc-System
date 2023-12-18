package com.javen.dao;

import com.javen.model.Course;

import java.util.List;

/**
 * @author Mango
 * @date 2022/12/05 21:55
 */
public interface CourseDao {
    /**
     * 查询所有课程
     *
     * @return 课程列表
     */
    List<Course> findAll();

    /**
     * 查询选课信息
     *
     * @param id 学生id
     * @return 选课信息
     */
    List<Course> findSelect(Integer id);

    /**
     * 根据名称查询课程
     *
     * @param course 课程
     * @return 课程
     */
    List<Course> findByName(Course course);

    /**
     * 新增课程
     *
     * @param course 课程
     * @return 新增情况
     */
    Integer addCourse(Course course);

    /**
     * 删除课程
     *
     * @param course 课程
     * @return 更新情况
     */
    Integer deleteCourse(Course course);

    /**
     * 更新课程
     *
     * @param course 课程
     * @return 更新情况
     */
    Integer updateCourse(Course course);

    /**
     * 选课
     *
     * @param course 课程
     * @return 选课情况
     */
    Integer selectCourse(Course course);
}
