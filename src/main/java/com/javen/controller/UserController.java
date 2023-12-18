package com.javen.controller;

import com.javen.model.User;
import com.javen.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Mango
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService loginService;

    /**
     * 登录
     *
     * @param user 用户
     * @return 登录情况
     */
    @RequestMapping("login")
    @ResponseBody
    public Integer findAll(User user) {
        return loginService.login(user);
    }

    /**
     * 查询登录用户ID
     *
     * @param user 用户
     * @return 用户ID
     */
    @RequestMapping("selectId")
    @ResponseBody
    public Integer selectId(User user) {
        return loginService.selectId(user);
    }

    /**
     * 修改密码
     *
     * @param user 用户
     * @return 修改情况
     */
    @RequestMapping("updatePassword")
    @ResponseBody
    public Integer updatePassword(User user) {
        int account = loginService.updatePassword(user);
        int data;
        if (account == 1) {
            data = 200;
        } else {
            data = 404;
        }
        return data;
    }

    /**
     * 账号密码重置
     *
     * @param user 用户
     * @return 重置情况
     */
    @RequestMapping("reset")
    @ResponseBody
    public Integer reset(User user) {
        int account = loginService.reset(user);
        int data;
        if (account == 1) {
            data = 200;
        } else {
            data = 404;
        }
        return data;
    }

}  
