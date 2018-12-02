package com.example.designpattern.structural.adapter.object_adapter;


/**
 * @Author: suxun
 * @Date: 2018/12/2 19:40
 * @Description:
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
