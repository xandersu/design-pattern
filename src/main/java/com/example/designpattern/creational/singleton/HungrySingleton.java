package com.example.designpattern.creational.singleton;

import java.io.Serializable;

/**
 * @Author: suxun
 * @Date: 2018/12/2 15:17
 * @Description:
 */
public class HungrySingleton implements Serializable,Cloneable {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    //私有化构造器
    private HungrySingleton() {
        //防止反射破坏单例
        if (hungrySingleton != null) {
            throw new RuntimeException("防止反射破坏单例");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    //防止序列化破坏单例
    private Object readResolve() {
        return hungrySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //防止克隆破坏单例
        return getInstance();
    }
}
