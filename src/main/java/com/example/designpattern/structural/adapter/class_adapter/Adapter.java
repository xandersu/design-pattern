package com.example.designpattern.structural.adapter.class_adapter;

/**
 * @Author: suxun
 * @Date: 2018/12/2 19:40
 * @Description:
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.adapteeRequest();
    }
}
