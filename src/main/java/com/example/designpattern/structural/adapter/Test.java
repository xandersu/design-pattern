package com.example.designpattern.structural.adapter;

/**
 * @Author: suxun
 * @Date: 2018/12/2 19:50
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.output5V();
    }
}
