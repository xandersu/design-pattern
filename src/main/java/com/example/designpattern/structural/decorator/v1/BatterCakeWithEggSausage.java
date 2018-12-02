package com.example.designpattern.structural.decorator.v1;

/**
 * @Author: suxun
 * @Date: 2018/12/2 18:43
 * @Description:
 */
public class BatterCakeWithEggSausage extends BatterCakeWithEgg {
    @Override
    protected String getDesc() {
        return super.getDesc() + "加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
