package com.example.designpattern.designdiscipline.dependencyinversion;

/**
 * @Author: suxun
 * @Date: 2018/11/19 22:18
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        //1
        Geely geely = new Geely();
        geely.studyJavaCourse();
        geely.studyFECourse();
        //2
        Geely geely1 = new Geely();
        geely1.studyImoocCourse(new JavaCourse());
        geely1.studyImoocCourse(new FECourse());
        //3
        Geely geely2 = new Geely(new JavaCourse());
        geely2.studyImoocCourse();
        //4
        Geely geely3 = new Geely();
        geely3.setiCourse(new JavaCourse());
        geely3.studyImoocCourse();
    }
}
