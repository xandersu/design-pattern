package com.example.designpattern.creational.builder;

/**
 * @Author: suxun
 * @Date: 2018/12/2 13:57
 * @Description:
 */
public class Test2 {
    public static void main(String[] args) {
        Course2 course2 = new Course2.CourseBuilder2().buildCourseArticle("java a").buildCourseName("java n").buildCoursePPT("java ppt").buildCourseQA("java qa").buildCourseVideo("java v").build();
        System.out.println(course2);
    }
}
