package com.example.designpattern.creational.factory;

import com.example.designpattern.creational.simple_factory_pattern.JavaVideo;
import com.example.designpattern.creational.simple_factory_pattern.Video;

/**
 * @Author: suxun
 * @Date: 2018/12/2 10:45
 * @Description:
 */
public class JavaVideoFactory extends VideoFactory {

    @Override
    public Video getVideo(String type) {
        return new JavaVideo();
    }
}
