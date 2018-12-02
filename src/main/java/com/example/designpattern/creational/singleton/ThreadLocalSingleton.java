package com.example.designpattern.creational.singleton;

import sun.security.jca.GetInstance;

/**
 * @Author: suxun
 * @Date: 2018/12/2 17:43
 * @Description: 线程单例
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocal = ThreadLocal.withInitial(() -> new ThreadLocalSingleton());

    private ThreadLocalSingleton() {
    }

    public static ThreadLocalSingleton getInstance() {
        return threadLocal.get();
    }
}
