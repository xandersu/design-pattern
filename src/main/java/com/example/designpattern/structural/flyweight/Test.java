package com.example.designpattern.structural.flyweight;

import org.springframework.beans.factory.parsing.EmptyReaderEventListener;

/**
 * @Author: suxun
 * @Date: 2018/12/3 21:50
 * @Description:
 */
public class Test {
    public static final String[] depts = {"RD", "QA", "PM"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String dept = depts[(int) (Math.random() * depts.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(dept);
            manager.report();
        }
    }
}
