package com.example.designpattern.behavioral.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Observable;

/**
 * @Author: suxun
 * @Date: 2018/12/9 16:50
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course extends Observable {
    private String courseName;

    public void produceQuestion(Course course, Question question) {
        System.out.println("有问题："+course + "-" + question);
        setChanged();
        notifyObservers(question);
    }
}
