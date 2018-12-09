package com.example.designpattern.behavioral.strategy;

/**
 * @Author: suxun
 * @Date: 2018/12/9 16:10
 * @Description:
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotion() {
        promotionStrategy.doPromotion();
    }
}
