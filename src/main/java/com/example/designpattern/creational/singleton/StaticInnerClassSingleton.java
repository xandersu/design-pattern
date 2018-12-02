package com.example.designpattern.creational.singleton;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

/**
 * @Author: suxun
 * @Date: 2018/12/2 15:10
 * @Description: 静态内部类
 * 基于类初始化的延迟加载解决方案
 * 线程0
 * -    CLass对象的初始化锁-》可能重排序
 * 线程1
 */
public class StaticInnerClassSingleton {
    //私有构造器！！！
    private StaticInnerClassSingleton() {
    }

    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();

    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }
}
