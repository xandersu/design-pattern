package com.example.designpattern.structural.proxy.dynamicproxy;

import com.example.designpattern.structural.proxy.Order;
import com.example.designpattern.structural.proxy.db.DataContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: suxun
 * @Date: 2018/12/9 12:29
 * @Description:
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target, args);
        afterMethod();
        return object;
    }

    private void beforeMethod(Object obj) {
        int userId = 0;
        System.out.println("dynamic proxy before");
        if (obj instanceof Order) {
            Order order = (Order) obj;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        System.out.println("dynamic proxy dbRouter=" + dbRouter);
        //set db type
        DataContextHolder.setDBType(dbRouter + "");
    }

    private void afterMethod() {
        System.out.println("dynamic after before");
    }
}
