package com.example.designpattern.structural.proxy;

/**
 * @Author: suxun
 * @Date: 2018/12/9 11:57
 * @Description:
 */
public class OrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        iOrderDao = new OrderDaoImpl();
        System.out.println("service dao insert order");
        return iOrderDao.insert(order);
    }
}
