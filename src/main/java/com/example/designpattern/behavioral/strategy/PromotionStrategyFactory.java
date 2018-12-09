package com.example.designpattern.behavioral.strategy;

import com.example.designpattern.structural.flyweight.Manager;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: suxun
 * @Date: 2018/12/9 16:11
 * @Description:
 */
public class PromotionStrategyFactory {
    private static Map<String, PromotionStrategy> map = new HashMap<>();

    static {
        map.put(PromotionKey.lj, new FXPStrategy());
        map.put(PromotionKey.mj, new LJPStrategy());
        map.put(PromotionKey.fx, new MJPStrategy());
    }

    private PromotionStrategyFactory() {
    }

    public static PromotionStrategy getPromotionStrategy(String type) {
        PromotionStrategy promotionStrategy = map.get(type);
        return promotionStrategy == null ? new DftPromotionStrategy() : promotionStrategy;
    }

    public interface PromotionKey {
        String lj = "lj";
        String mj = "mj";
        String fx = "fx";
    }
}
