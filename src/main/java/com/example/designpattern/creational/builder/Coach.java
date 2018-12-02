package com.example.designpattern.creational.builder;

/**
 * @Author: suxun
 * @Date: 2018/12/2 13:14
 * @Description:
 */
public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courName, String coursePPT, String courseVideo, String courseArticle, String courseQA) {
        courseBuilder.buildCourseArticle(courseArticle);
        courseBuilder.buildCourseName(courName);
        courseBuilder.buildCoursePPT(coursePPT);
        courseBuilder.buildCourseQA(courseQA);
        courseBuilder.buildCourseVideo(courseVideo);
        return courseBuilder.makeCourse();
    }
}
