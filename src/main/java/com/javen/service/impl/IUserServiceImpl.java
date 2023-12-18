package com.javen.service.impl;

import com.javen.dao.UserDao;
import com.javen.model.User;
import com.javen.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mango
 */
@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    private UserDao loginDao;

    @Override
    public Integer login(User user) {
        return loginDao.login(user);
    }

    @Override
    public Integer selectId(User user) {
        return loginDao.selectId(user);
    }

    @Override
    public Integer updatePassword(User user) {
        return loginDao.updatePassword(user);
    }

    @Override
    public Integer reset(User user) {
        return loginDao.reset(user);
    }
}
