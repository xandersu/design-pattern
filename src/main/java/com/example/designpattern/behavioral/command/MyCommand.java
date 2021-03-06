package com.example.designpattern.behavioral.command;

/**
 * @Author: suxun
 * @Date: 2018/12/9 17:46
 * @Description: 命令模式
 * 将一个请求封装成一个对象，从而使您可以用不同的请求对客户进行参数化。
 * 命令模式解决了应用程序中对象的职责以及他们之间的通信方式
 * 行为型模式
 * 请求调用者和请求接受者需要解耦，使得调用者和接受者不直接交互
 * 抽象出等待执行的行为
 * 优点：
 * 降低耦合
 * 容易扩展新命令活着的一组命令
 * 缺点：
 * 增加类数量，提高复杂度
 * 其他模式：
 * 备忘录模式
 */
public interface MyCommand {
}
