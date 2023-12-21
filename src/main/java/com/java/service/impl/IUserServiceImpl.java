package com.java.service.impl;

import com.java.model.User;
import com.java.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author Mango
 */
@Service
public class IUserServiceImpl implements IUserService {


    @Override
    public Integer login(String username, String identity, String password) {

        return null;
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
