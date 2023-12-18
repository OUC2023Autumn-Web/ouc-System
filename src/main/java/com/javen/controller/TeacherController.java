package com.javen.controller;

import com.javen.model.Teacher;
import com.javen.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Mango
 * @date 2022/12/05 21:25
 */
@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private ITeacherService iTeacherService;

    /**
     * 查询所有老师
     *
     * @return 老师列表
     */
    @RequestMapping("findAll")
    @ResponseBody
    public Map<String, Object> findAll() {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", 0);
        result.put("msg", "");
        result.put("count",iTeacherService.findAll().size());
        result.put("data",iTeacherService.findAll());
        return result;
    }

    /**
     * 按姓名查询
     *
     * @param teacher 老师
     * @return 老师
     */
    @RequestMapping("findByName")
    @ResponseBody
    public Map<String, Object> findByName(Teacher teacher) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", 0);
        result.put("msg", "");
        result.put("count",iTeacherService.findByName(teacher).size());
        result.put("data",iTeacherService.findByName(teacher));
        return result;
    }

    /**
     * 按id查询
     *
     * @param id 老师id
     * @return 老师
     */
    @RequestMapping("getTeacherById")
    @ResponseBody
    public Teacher getTeacherById(Integer id) {
        return iTeacherService.getTeacherById(id);
    }

    /**
     * 新增老师
     *
     * @param teacher 老师
     * @return 新增情况
     */
    @RequestMapping("addTeacher")
    @ResponseBody
    public Integer addTeacher(Teacher teacher) {
        int account = iTeacherService.addTeacher(teacher);
        int data;
        if (account == 1) {
            data = 200;
        } else {
            data = 404;
        }
        return data;
    }

    /**
     * 删除老师
     *
     * @param teacher 老师
     * @return 删除情况
     */
    @RequestMapping("deleteTeacher")
    @ResponseBody
    public Integer deleteTeacher(Teacher teacher) {
        int account = iTeacherService.deleteTeacher(teacher);
        int data;
        if (account == 1) {
            data = 200;
        } else {
            data = 404;
        }
        return data;
    }

    /**
     * 更新老师
     *
     * @param teacher 老师
     * @return 更新情况
     */
    @RequestMapping("updateTeacher")
    @ResponseBody
    public Integer updateTeacher(Teacher teacher) {
        int account = iTeacherService.updateTeacher(teacher);
        int data;
        if (account == 1) {
            data = 200;
        } else {
            data = 404;
        }
        return data;
    }
}
