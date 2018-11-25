package com.example.designpattern.creational.simple_factory_pattern;

/**
 * @Author: suxun
 * @Date: 2018/11/25 21:48
 * @Description:
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python视频");
    }
}
