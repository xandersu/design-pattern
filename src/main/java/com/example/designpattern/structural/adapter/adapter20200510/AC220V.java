package com.example.designpattern.structural.adapter.adapter20200510;

/**
 * @author su
 * @date 2020/5/1010:40
 * @description
 */
public class AC220V implements Charge {
    @Override
    public void charge() {
        System.out.println("进行220V充电");
    }
}
