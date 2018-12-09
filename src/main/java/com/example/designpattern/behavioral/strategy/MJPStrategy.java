package com.example.designpattern.behavioral.strategy;

/**
 * @Author: suxun
 * @Date: 2018/12/9 16:05
 * @Description:
 */
public class MJPStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("man jian");
    }

}
