package com.example.designpattern.structural.facade;

/**
 * @Author: suxun
 * @Date: 2018/12/2 18:02
 * @Description:
 */
public class PointPaymentService {

    public boolean pay(PointGift pointGift){
        System.out.println("扣积分"+pointGift.getName()+"成功。");
        return true;
    }
}
