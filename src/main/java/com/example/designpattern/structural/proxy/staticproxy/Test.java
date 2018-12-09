package com.example.designpattern.structural.proxy.staticproxy;

import com.example.designpattern.structural.proxy.Order;

/**
 * @Author: suxun
 * @Date: 2018/12/9 12:13
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
