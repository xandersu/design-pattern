package com.example.designpattern.structural.proxy.staticproxy;

import com.example.designpattern.structural.proxy.IOrderService;
import com.example.designpattern.structural.proxy.Order;
import com.example.designpattern.structural.proxy.OrderServiceImpl;
import com.example.designpattern.structural.proxy.db.DataContextHolder;

/**
 * @Author: suxun
 * @Date: 2018/12/9 12:00
 * @Description:
 */
public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public int saveOrder(Order order) {
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        int res = iOrderService.saveOrder(order);
        afterMethod();
        return res;
    }

    private void beforeMethod(Order order) {
        System.out.println("static proxy before");
        Integer userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("static proxy dbRouter=" + dbRouter);
        //set db type
        DataContextHolder.setDBType(dbRouter + "");
    }

    private void afterMethod() {
        System.out.println("static proxy after");
    }
}
