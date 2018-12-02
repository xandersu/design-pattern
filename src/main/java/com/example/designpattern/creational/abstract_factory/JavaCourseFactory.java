package com.example.designpattern.creational.abstract_factory;

/**
 * @Author: suxun
 * @Date: 2018/12/2 12:09
 * @Description:
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
