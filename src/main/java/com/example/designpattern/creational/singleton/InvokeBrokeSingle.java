package com.example.designpattern.creational.singleton;

import java.lang.reflect.Constructor;

/**
 * @Author: suxun
 * @Date: 2018/12/2 15:34
 * @Description: 反射破坏单例
 */
public class InvokeBrokeSingle {
    public static void main(String[] args) throws Exception {
        Class clazz = HungrySingleton.class;
        Constructor constructor = clazz.getDeclaredConstructor();
        //改变构造器权限
        constructor.setAccessible(true);
        HungrySingleton instance = HungrySingleton.getInstance();
        System.out.println(instance);
        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
        System.out.println(newInstance);
        //饿汉模式可以防止反射攻击
        //懒加载不能防止反射破坏单例
    }
}
