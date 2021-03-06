package com.example.designpattern.behavioral.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: suxun
 * @Date: 2018/12/9 16:51
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher implements Observer {
    private String teacherName;

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println("update :"+teacherName + "-" + course + "-" + question);
    }
}
