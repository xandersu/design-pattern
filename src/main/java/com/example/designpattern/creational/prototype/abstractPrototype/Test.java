package com.example.designpattern.creational.prototype.abstractPrototype;

/**
 * @Author: suxun
 * @Date: 2018/12/2 17:21
 * @Description:
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        B bc = (B) b.clone();
        System.out.println(bc);
    }
}
