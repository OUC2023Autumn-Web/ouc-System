package com.java.service;

import com.java.model.User;

import java.util.ArrayList;

/**
 * @author Mango
 */
public interface IUserService {

    Integer login(String username, String identity, String password);

    void repassword(User user);

    ArrayList<User> getinformation(User user);

    void setinformation(User user);
}
