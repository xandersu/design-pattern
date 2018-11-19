package com.example.designpattern.designdiscipline.dependencyinversion;

/**
 * @Author: suxun
 * @Date: 2018/11/19 22:22
 * @Description:
 */
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习Java课程");
    }
}
