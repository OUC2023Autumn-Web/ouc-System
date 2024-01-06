package com.java.dao;

import com.java.model.Login.LogInstance;
import com.java.model.User;

/**
 * @author Mango
 */
public interface UserDao {
    /**
     * 登录
     *
     * @param user 登录信息
     * @return 查询数据条数
     */
    Integer login(LogInstance log);
    void repassword(LogInstance logs);
    User getinformation(User user);
    void setinformation(User user);
    /**
     * 查询id
     *
     * @param user 登录信息
     * @return ID
     */
    Integer selectId(User user);

    /**
     * 修改密码
     *
     * @param user 用户
     * @return 更新情况
     */
    Integer updatePassword(User user);

    /**
     * 账号密码重置
     *
     * @param user 用户
     * @return 更新情况
     */
    Integer reset(User user);
}
