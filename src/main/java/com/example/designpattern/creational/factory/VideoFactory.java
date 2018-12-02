package com.example.designpattern.creational.factory;

import com.example.designpattern.creational.simple_factory_pattern.Video;

/**
 * @Author: suxun
 * @Date: 2018/11/25 21:51
 * @Description:
 */
public abstract class VideoFactory {
    /**
     *
     */
    public abstract Video getVideo(String type);
}
