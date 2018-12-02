package com.example.designpattern.creational.prototype.abstractPrototype;

/**
 * @Author: suxun
 * @Date: 2018/12/2 17:21
 * @Description:
 */
public abstract class A implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
