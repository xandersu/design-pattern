package com.example.designpattern.designdiscipline.dependencyinversion;

/**
 * @Author: suxun
 * @Date: 2018/11/19 22:22
 * @Description:
 */
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习FE课程");
    }
}
