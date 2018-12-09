package com.example.designpattern.behavioral.strategy;

/**
 * @Author: suxun
 * @Date: 2018/12/9 15:52
 * @Description: 策略模式
 * 定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。
 * 在有多种算法相似的情况下，使用 if...else 所带来的复杂和难以维护。
 * 行为型
 * 适用场景：
 * 类区别是行为不同
 * 一个系统需要动态的在几种算法中选择一种
 * 优点：
 * 开闭原则
 * 避免使用多重条件转移语句
 * 提高算法的保密性和安全性
 * 缺点：
 * 客户端必须知道所有策略类，并自行决定使用哪一个策略类
 * 产生很多策略类
 * 相关：
 * 工厂模式
 */
public interface MyStrategy {
}
