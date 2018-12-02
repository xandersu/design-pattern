package com.example.designpattern.structural.decorator.v2;

/**
 * @Author: suxun
 * @Date: 2018/12/2 18:40
 * @Description:
 */
public class BatterCake extends AbstractBatterCake {

    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
