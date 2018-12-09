package com.example.designpattern.structural.bridge;

/**
 * @Author: suxun
 * @Date: 2018/12/9 10:42
 * @Description: 桥接模式
 * 将抽象部分与实现部分分离，使它们都可以独立的变化。
 * 通过组合的方式建立两个类之间的联系，而不是继承
 * 结构型
 * 适用场景：
 * 抽象和具体实现之间增加更多的灵活性
 * 一个类存在两个（或多个）独立变化的维度，且这两个（或多个）维度都需要独立进行扩展
 * 不希望使用继承，或因为多层继承导致系统类的个数剧增
 * 优点：
 * 分离抽象部分及其具体实现部分
 * 提高系统的可扩展性
 * 开闭原则
 * 合成复用原则
 * 缺点：
 * 增加了系统的理解和设计维度
 * 需要正确地识别出系统中两个独立变化的维度
 * 相关设计模式
 * 组合模式：部分和全部的组合
 * 适配器模式：都是为了配合工作，改变接口 -桥接模式：抽象和实现分离
 */
public interface MyBridge {
}