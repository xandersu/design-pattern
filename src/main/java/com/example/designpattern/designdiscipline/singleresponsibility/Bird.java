package com.example.designpattern.designdiscipline.singleresponsibility;

/**
 * @Author: suxun
 * @Date: 2018/11/19 22:46
 * @Description:
 */
public class Bird {
    public void mainMoveMode(String birdName) {
        if ("鸵鸟".equals(birdName)) {
            System.out.println(birdName + "用脚走");
        } else {
            System.out.println(birdName + "用翅膀飞");
        }
    }
}
