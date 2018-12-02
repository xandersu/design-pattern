package com.example.designpattern.creational.singleton;

import java.io.*;

/**
 * @Author: suxun
 * @Date: 2018/12/2 15:21
 * @Description: 序列化破坏单例测试
 */
public class SerilazeBrokeSingleTest {
    public static void main(String[] args) throws Exception {
        HungrySingleton instance = HungrySingleton.getInstance();
        System.out.println(instance);
        String fileName = "singleton_file";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
        oos.writeObject(instance);

        File file = new File(fileName);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
        System.out.println(newInstance);
    }
}
