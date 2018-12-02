package com.example.designpattern.structural.facade;

/**
 * @Author: suxun
 * @Date: 2018/12/2 18:08
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        PointGift pointGift = new PointGift();
        pointGift.setName("T-shirt");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.setPointPaymentService(new PointPaymentService());
        giftExchangeService.setQualifyService(new QualifyService());
        giftExchangeService.setShippingService(new ShippingService());
        giftExchangeService.giftExchange(pointGift);
    }
}
