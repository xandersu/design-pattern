package com.example.designpattern.creational.builder;

/**
 * @Author: suxun
 * @Date: 2018/12/2 13:18
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder builder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(builder);
        Course course = coach.makeCourse("java name", "java ppt", "java video", "java article", "java qa");
        System.out.println(course);
    }
}
