package com.example.designpattern.behavioral.strategy;

/**
 * @Author: suxun
 * @Date: 2018/12/9 16:05
 * @Description:
 */
public class LJPStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("li jian");
    }
}
