package com.example.designpattern.creational.builder;

import lombok.Data;
import lombok.ToString;

/**
 * @Author: suxun
 * @Date: 2018/12/2 13:08
 * @Description:
 */
@Data
@ToString
public class Course2 {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    private String courseQA;

    public Course2(CourseBuilder2 courseBuilder2) {
        this.courseName = courseBuilder2.courseName;
        this.coursePPT = courseBuilder2.coursePPT;
        this.courseVideo = courseBuilder2.courseVideo;
        this.courseArticle = courseBuilder2.courseArticle;
        this.courseQA = courseBuilder2.courseQA;
    }

    public static class CourseBuilder2 {
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;
        private String courseQA;

        public CourseBuilder2 buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;

        }

        public CourseBuilder2 buildCoursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder2 buildCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder2 buildCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }

        public CourseBuilder2 buildCourseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        public Course2 build() {
            return new Course2(this);
        }
    }
}
