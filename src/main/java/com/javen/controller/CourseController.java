package com.javen.controller;

import com.javen.model.Course;
import com.javen.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Mango
 * @date 2022/12/05 21:55
 */
@Controller
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private ICourseService iCourseService;

    /**
     * 查询所有课程
     *
     * @param id 当前登录的学生id
     * @return 课程列表
     */
    @RequestMapping("findAll")
    @ResponseBody
    public Map<String, Object> findAll(Integer id) {
        List<Course> courses = iCourseService.findAll();
        List<Course> courses1 = iCourseService.findSelect(id);
        for (Course course : courses) {
            course.setC_id(0);
        }
        int j = 0;
        while (j < courses.size()) {
            for (Course course : courses1) {
                if (courses.get(j).getId().equals(course.getC_id())) {
                    courses.get(j).setC_id(1);
                }
            }
            j++;
        }
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", 0);
        result.put("msg", "");
        result.put("count",courses.size());
        result.put("data",courses);
        return result;
    }

    /**
     * 按姓名查询
     *
     * @param course 课程
     * @return 课程
     */
    @RequestMapping("findByName")
    @ResponseBody
    public Map<String, Object> findByName(Course course) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", 0);
        result.put("msg", "");
        result.put("count",iCourseService.findByName(course).size());
        result.put("data",iCourseService.findByName(course));
        return result;
    }

    /**
     * 新增课程
     *
     * @param course 课程
     * @return 新增情况
     */
    @RequestMapping("addCourse")
    @ResponseBody
    public Integer addCourse(Course course) {
        int account = iCourseService.addCourse(course);
        int data;
        if (account == 1) {
            data = 200;
        } else {
            data = 404;
        }
        return data;
    }

    /**
     * 删除课程
     *
     * @param course 课程
     * @return 删除情况
     */
    @RequestMapping("deleteCourse")
    @ResponseBody
    public Integer deleteCourse(Course course) {
        int account = iCourseService.deleteCourse(course);
        int data;
        if (account == 1) {
            data = 200;
        } else {
            data = 404;
        }
        return data;
    }

    /**
     * 更新课程
     *
     * @param course 课程
     * @return 更新情况
     */
    @RequestMapping("updateCourse")
    @ResponseBody
    public Integer updateCourse(Course course) {
        int account = iCourseService.updateCourse(course);
        int data;
        if (account == 1) {
            data = 200;
        } else {
            data = 404;
        }
        return data;
    }
    /**
     * 选课
     *
     * @param course 课程
     * @return 选课情况
     */
    @RequestMapping("selectCourse")
    @ResponseBody
    public Integer selectCourse(Course course) {
        int account1 = iCourseService.updateCourse(course);
        int account2 = iCourseService.selectCourse(course);
        int data;
        if (account1 == 1 && account2 == 1) {
            data = 200;
        } else {
            data = 404;
        }
        return data;
    }
}
