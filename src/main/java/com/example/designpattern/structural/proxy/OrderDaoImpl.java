package com.example.designpattern.structural.proxy;

/**
 * @Author: suxun
 * @Date: 2018/12/9 11:57
 * @Description:
 */
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("insert order success!");
        return 1;
    }
}
