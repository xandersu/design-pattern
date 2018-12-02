package com.example.designpattern.creational.singleton;


/**
 * @Author: suxun
 * @Date: 2018/12/2 14:50
 * @Description: 懒加载-懒汉模式-双重检查
 */
public class LazyDoubleCheckSingleton {
    //volatile禁止重排序，所有线程都能看到最新值
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {
    }

    //线程不安全
    private static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //1.第一步分配内存
                    //2.初始化对象
                    //3.设置lazyDoubleCheckSingleton指向刚分配的内存
                    //2和3可能互换位置，指令重排序，解决办法变量加volatile
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
