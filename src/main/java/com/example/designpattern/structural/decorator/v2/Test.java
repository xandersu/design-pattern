package com.example.designpattern.structural.decorator.v2;

/**
 * @Author: suxun
 * @Date: 2018/12/2 18:57
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        AbstractBatterCake abstractBatterCake = new BatterCake();
        abstractBatterCake = new EggDecorator(abstractBatterCake);
        abstractBatterCake = new EggDecorator(abstractBatterCake);
        abstractBatterCake = new SausageDecorator(abstractBatterCake);
        System.out.println(abstractBatterCake.getDesc() + "-" + abstractBatterCake.cost());

    }
}
