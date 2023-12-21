package com.java.service;

import com.java.model.Course;

import java.util.ArrayList;

public interface IAdministratorService {
    ArrayList<Course> getAll();

    void putcourse(Course course);

    void deletecourse(Course course);
}
