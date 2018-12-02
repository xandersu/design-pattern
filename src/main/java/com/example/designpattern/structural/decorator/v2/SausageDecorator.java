package com.example.designpattern.structural.decorator.v2;

/**
 * @Author: suxun
 * @Date: 2018/12/2 18:55
 * @Description:
 */
public class SausageDecorator extends AbstractDecoratorBatterCake {
    public SausageDecorator(AbstractBatterCake abstractBatterCake) {
        super(abstractBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
