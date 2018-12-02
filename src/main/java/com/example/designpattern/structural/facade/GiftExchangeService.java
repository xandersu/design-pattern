package com.example.designpattern.structural.facade;

import lombok.Data;

/**
 * @Author: suxun
 * @Date: 2018/12/2 18:05
 * @Description:
 */
@Data
public class GiftExchangeService {
    private QualifyService qualifyService;
    private PointPaymentService pointPaymentService;
    private ShippingService shippingService;

    public void giftExchange(PointGift pointGift) {
        if (qualifyService.isAvailable(pointGift)) {
            if (pointPaymentService.pay(pointGift)) {
                String orderNo = shippingService.shipGift(pointGift);
                System.out.println("物流订单下单成功，订单号：" + orderNo);
            }
        }
    }
}
