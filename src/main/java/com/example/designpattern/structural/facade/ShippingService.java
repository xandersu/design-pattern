package com.example.designpattern.structural.facade;

/**
 * @Author: suxun
 * @Date: 2018/12/2 18:03
 * @Description:
 */
public class ShippingService {
    public String shipGift(PointGift pointGift) {
        System.out.println("物流" + pointGift.getName() + "成功");
        String orderNo = "666";
        return orderNo;
    }
}
