package com.example.designpattern.creational.singleton;


/**
 * @Author: suxun
 * @Date: 2018/12/2 14:50
 * @Description: 懒加载-懒汉模式
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
    }
    //线程不安全
    private static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
    //线程安全
//    private synchronized static LazySingleton getInstance() {
//        if (lazySingleton == null) {
//            lazySingleton = new LazySingleton();
//        }
//        return lazySingleton;
//    }
}
