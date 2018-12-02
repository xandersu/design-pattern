package com.example.designpattern.structural.decorator.v2;

/**
 * @Author: suxun
 * @Date: 2018/12/2 18:53
 * @Description:
 */
public class AbstractDecoratorBatterCake extends AbstractBatterCake {
    private AbstractBatterCake abstractBatterCake;

    public AbstractDecoratorBatterCake(AbstractBatterCake abstractBatterCake) {
        this.abstractBatterCake = abstractBatterCake;
    }

    @Override
    protected String getDesc() {
        return abstractBatterCake.getDesc();
    }

    @Override
    protected int cost() {
        return abstractBatterCake.cost();
    }
}
