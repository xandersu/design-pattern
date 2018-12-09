package com.example.designpattern.behavioral.observer;

/**
 * @Author: suxun
 * @Date: 2018/12/9 16:55
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course("java");
        Teacher teacher1 = new Teacher("alpha");
        Teacher teacher2 = new Teacher("b");
        course.addObserver(teacher1);
        course.addObserver(teacher2);

        //
        Question question = new Question("stu", "java q?");

        course.produceQuestion(course,question);
    }
}
