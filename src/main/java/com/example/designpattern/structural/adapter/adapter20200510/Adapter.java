package com.example.designpattern.structural.adapter.adapter20200510;

/**
 * @author su
 * @date 2020/5/1010:41
 * @description
 */
public class Adapter {

    public void charge(Charge charge) {
        charge.charge();
        if (charge instanceof AC110V) {
            System.out.println("110V 转 5V");
        } else if (charge instanceof AC220V) {
            System.out.println("220V 转 5V");
        }
        System.out.println("5V充电");
    }
}
