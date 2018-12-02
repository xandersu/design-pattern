package com.example.designpattern.structural.decorator.v1;

/**
 * @Author: suxun
 * @Date: 2018/12/2 18:43
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getDesc() + "-" + batterCake.cost());
        BatterCakeWithEgg batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getDesc() + "-" + batterCakeWithEgg.cost());
        BatterCakeWithEggSausage batterCakeWithEggSausage = new BatterCakeWithEggSausage();
        System.out.println(batterCakeWithEggSausage.getDesc() + "-" + batterCakeWithEggSausage.cost());
    }
}
