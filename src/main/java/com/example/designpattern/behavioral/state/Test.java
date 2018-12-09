package com.example.designpattern.behavioral.state;

/**
 * @Author: suxun
 * @Date: 2018/12/9 19:02
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        courseVideoContext.setCourseVideoState(new PlayState());
        System.out.println("now state " + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.pause();
        System.out.println("now state " + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.speed();
        System.out.println("now state " + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.stop();
        System.out.println("now state " + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.speed();
        System.out.println("now state " + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
    }
}
