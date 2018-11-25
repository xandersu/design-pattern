package com.example.designpattern.designdiscipline.dependency_inversion;

import lombok.NoArgsConstructor;

/**
 * @Author: suxun
 * @Date: 2018/11/19 22:17
 * @Description: cmd+n -> generate
 */
@NoArgsConstructor
public class Geely {
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public Geely(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImoocCourse() {
        iCourse.studyCourse();
    }

    public void studyImoocCourse(ICourse iCourse) {
        iCourse.studyCourse();
    }

    public void studyJavaCourse() {
        System.out.println("学习Java课程");
    }

    public void studyFECourse() {
        System.out.println("学习Font课程");
    }

    public void studyPythonCourse() {
        System.out.println("学习Python课程");
    }
}
