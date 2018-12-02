package com.example.designpattern.structural.adapter.class_adapter;

/**
 * @Author: suxun
 * @Date: 2018/12/2 19:35
 * @Description:
 */
public class ConcreteTarget implements  Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget目标方法");
    }
}
