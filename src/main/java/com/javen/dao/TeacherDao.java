package com.javen.dao;

import com.javen.model.Teacher;

import java.util.List;

/**
 * @author Mango
 * @date 2022/12/05 21:12
 */
public interface TeacherDao {
    /**
     * 查询所有老师
     *
     * @return 老师列表
     */
    List<Teacher> findAll();

    /**
     * 根据姓名查询老师
     *
     * @param teacher 老师
     * @return 老师
     */
    List<Teacher> findByName(Teacher teacher);
    /**
     * 根据id查询老师
     *
     * @param id 查询id
     * @return 老师
     */
    Teacher getTeacherById(Integer id);

    /**
     * 新增老师
     *
     * @param teacher 老师
     * @return 新增情况
     */
    Integer addTeacher(Teacher teacher);

    /**
     * 删除老师
     *
     * @param teacher 老师
     * @return 更新情况
     */
    Integer deleteTeacher(Teacher teacher);

    /**
     * 更新老师
     *
     * @param teacher 老师
     * @return 更新情况
     */
    Integer updateTeacher(Teacher teacher);
}
