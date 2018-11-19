package com.example.designpattern.designdiscipline.singleresponsibility;

/**
 * @Author: suxun
 * @Date: 2018/11/19 22:51
 * @Description:
 */
public interface ICourse {
    String getCourseName();

    byte[] getCourseVideo();

    void studyCourse();

    void refundCourse();
}
