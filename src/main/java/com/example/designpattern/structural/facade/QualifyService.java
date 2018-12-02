package com.example.designpattern.structural.facade;

/**
 * @Author: suxun
 * @Date: 2018/12/2 18:01
 * @Description:
 */
public class QualifyService {

    public boolean isAvailable(PointGift pointGift) {
        System.out.println("校验" + pointGift.getName() + "几分通过，库存通过.");
        return true;
    }
}
