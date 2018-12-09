package com.example.designpattern.structural.proxy.dynamicproxy;

import com.example.designpattern.structural.proxy.IOrderService;
import com.example.designpattern.structural.proxy.Order;
import com.example.designpattern.structural.proxy.OrderServiceImpl;

/**
 * @Author: suxun
 * @Date: 2018/12/9 12:39
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);
        IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderService.saveOrder(order);
    }
}
