package com.java.service.impl;

import com.java.model.Course;
import com.java.service.IAdministratorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class IAdministratorServiceImpl implements IAdministratorService {

    @Override
    public ArrayList<Course> getAll() {
        return null;
    }

    @Override
    public void putcourse(Course course) {

    }

    @Override
    public void deletecourse(Course course) {

    }
}
