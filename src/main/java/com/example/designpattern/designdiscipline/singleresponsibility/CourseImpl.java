package com.example.designpattern.designdiscipline.singleresponsibility;

/**
 * @Author: suxun
 * @Date: 2018/11/19 22:54
 * @Description:
 */
public class CourseImpl implements ICourseManage,ICourseContent {
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
