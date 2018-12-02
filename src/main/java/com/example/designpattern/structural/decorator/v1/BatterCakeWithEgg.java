package com.example.designpattern.structural.decorator.v1;

/**
 * @Author: suxun
 * @Date: 2018/12/2 18:42
 * @Description:
 */
public class BatterCakeWithEgg extends BatterCake {
    @Override
    protected String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
