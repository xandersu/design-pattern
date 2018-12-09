package com.example.designpattern.behavioral.strategy;

/**
 * @Author: suxun
 * @Date: 2018/12/9 16:13
 * @Description:
 */
public class DftPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("default");
    }
}
