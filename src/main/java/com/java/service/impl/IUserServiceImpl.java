package com.java.service.impl;

import com.java.model.Login.LogInstance;
import com.java.model.User;
import com.java.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.java.dao.UserDao;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Mango
 */

@Service
public class IUserServiceImpl implements IUserService {
    @Autowired
    private UserDao loginDao;

    @Override
    public Integer login(String username, String identity, String password) {
        LogInstance log = new LogInstance();
        log.password=password;
        log.username=username;
        log.identity=identity;
        return loginDao.login(log);
    }

    @Override
    public void repassword(User user) {

    }

    @Override
    public ArrayList<User> getinformation(User user) {

        return null;
    }

    @Override
    public void setinformation(User user) {

    }
}
