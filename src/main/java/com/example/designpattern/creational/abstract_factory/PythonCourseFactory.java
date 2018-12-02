package com.example.designpattern.creational.abstract_factory;

/**
 * @Author: suxun
 * @Date: 2018/12/2 12:15
 * @Description:
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
