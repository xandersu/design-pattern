package com.example.designpattern.designdiscipline.single_responsibility;

/**
 * @Author: suxun
 * @Date: 2018/11/19 22:46
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.mainMoveMode("大雁");
        //鸵鸟不能用翅膀飞
        bird.mainMoveMode("鸵鸟");

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");
        WorkBird workBird = new WorkBird();
        workBird.mainMoveMode("鸵鸟");
    }
}
