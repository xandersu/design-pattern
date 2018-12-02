package com.example.designpattern.creational.factory;


/**
 * @Author: suxun
 * @Date: 2018/11/25 21:48
 * @Description:
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java视频");
    }
}
