package com.example.designpattern.creational.simple_factory_pattern;

/**
 * @Author: suxun
 * @Date: 2018/11/25 21:49
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
//        Video video = new JavaVideo();
//        video.produce();
        //2
//        VideoFactory vf = new VideoFactory();
//        Video video = vf.getVideo("java");
//        if (video != null) {
//            video.produce();
//        }
        //3
        VideoFactory vf = new VideoFactory();
        Video video = vf.getVideo(JavaVideo.class);
        if (video != null) {
            video.produce();
        }
    }
}
