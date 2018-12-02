package com.example.designpattern.structural.adapter.object_adapter;

/**
 * @Author: suxun
 * @Date: 2018/12/2 19:45
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();
        Target adapter = new Adapter();
        adapter.request();
    }
}
