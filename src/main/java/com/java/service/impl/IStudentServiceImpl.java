package com.java.service.impl;

import com.java.dao.CourseDao;
import com.java.model.Course;
import com.java.model.Student;
import com.java.model.StudentInstances.StuInstance1;
import com.java.model.StudentInstances.StuInstance2;

import com.java.model.StudentInstances.StuInstance3;
import com.java.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.java.dao.StudentDao;
import java.util.ArrayList;

import static com.java.model.dayEnum.*;

/**
 * @author Mango
 */
@Service
public class IStudentServiceImpl implements IStudentService {

    @Autowired
    private StudentDao studentDao;
    @Autowired
    private CourseDao courseDao;
    @Override
    public ArrayList<StuInstance1> findAll(String username) {
        Student stu = new Student();
        stu.number=username;
        return studentDao.findAll(stu);
    }

    @Override
    public ArrayList<Course> getSome(String name) {
        Course cou = new Course();
        cou.setNumber(name);
        cou.setName(name);
        return studentDao.getSome(cou);
    }
    @Override
    public ArrayList<Course> getAll() {
        return studentDao.getAll();
    }
    @Override
    public void deleteCourse(String username, String number) {
        StuInstance3 stu3 = new StuInstance3();
        stu3.number=number;
        stu3.username=username;
        studentDao.delete(stu3);
    }

    @Override
    public int putCourse(String username, String number) {
        StuInstance3 stu3 = new StuInstance3();
        stu3.number=number;
        stu3.username=username;
        studentDao.putCourse(stu3);
        return 1;
    }


    @Override
    public StuInstance2[] getALLtime(String username) {
        StuInstance2[] arr = new StuInstance2[12];
        for (int i = 0; i < 12; i++) {
            arr[i] = new StuInstance2();
        }
        StuInstance3 stu3 = new StuInstance3();
        stu3.username=username;
        ArrayList<StuInstance1> arr1;
        arr1 = studentDao.getALLtime(stu3);
        for(int i=0;i<arr1.size();i++){
            String time = arr1.get(i).getTime().substring(2,4);
            int x = -1,y = 0;
            if(time.charAt(0)=='一'){
                x=0;
            }
            if(time.charAt(0)=='二'){
                x=1;
            }
            if(time.charAt(0)=='三'){
                x=2;
            }
            if(time.charAt(0)=='四'){
                x=3;
            }
            if(time.charAt(0)=='五'){
                x=4;
            }
            if(time.charAt(0)=='六'){
                x=5;
            }
            if(time.charAt(0)=='七'){
                x=6;
            }
            if(time.charAt(0)=='八'){
                x=7;
            }
            if(time.charAt(0)=='九'){
                x=8;
            }
            y=x+1;
            char week = arr1.get(i).getTime().charAt(1);
            if(week == '一'){
                arr[x].Monday=arr1.get(i).getName();
                arr[y].Monday=arr1.get(i).getName();
            }
            if(week == '二'){
                arr[x].Tuesday=arr1.get(i).getName();
                arr[y].Tuesday=arr1.get(i).getName();
            }
            if(week == '三'){
                arr[x].Wednesday=arr1.get(i).getName();
                arr[y].Wednesday=arr1.get(i).getName();
            }
            if(week == '四'){
                arr[x].Thursday=arr1.get(i).getName();
                arr[y].Thursday=arr1.get(i).getName();
            }
            if(week == '五'){
                arr[x].Friday=arr1.get(i).getName();
                arr[y].Friday=arr1.get(i).getName();
            }
            if(week == '六'){
                arr[x].Saturday=arr1.get(i).getName();
                arr[y].Saturday=arr1.get(i).getName();
            }
            if(week == '七'){
                arr[x].Sunday=arr1.get(i).getName();
                arr[y].Sunday=arr1.get(i).getName();
            }
        }
        return arr;
    }

}
