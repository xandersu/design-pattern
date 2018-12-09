package com.example.designpattern.behavioral.observer;

/**
 * @Author: suxun
 * @Date: 2018/12/9 16:47
 * @Description: 观察者模式
 * 定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
 * 行为型
 * 场景：
 * 关联行为场景，建立一套出发层机制
 * 优点：
 * 观察者和被观察者建立一个抽象的耦合
 * 支持广播通信
 * 缺点：
 * 观察者之间有过多的细节依赖，提高时间消耗以及程序复杂度
 * 使用得当，避免循环调用
 */
public interface MyObserver {
}
