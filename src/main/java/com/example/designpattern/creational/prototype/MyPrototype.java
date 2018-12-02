package com.example.designpattern.creational.prototype;

/**
 * @Author: suxun
 * @Date: 2018/12/2 16:35
 * @Description: 原型模式
 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * 不需要知道任何创建的细节，不调用构造函数
 * 创建型
 * 场景：
 * 类初始化消耗很多资源
 * new产生的一个对象需要非常繁琐的过程（数据准备、访问权限等）
 * 构造函数比较复杂
 * 循环体中产生大量对象时
 * 优点：
 * 比直接new性能搞
 * 简化创建过程
 * 缺点：
 * 必须配备克隆方法
 * 对克隆复杂对象或克隆出来的对象进行复杂改造时，容易引入风险
 * 深拷贝、浅拷贝要运用得当
 * clone 不调用构造器
 */
public interface MyPrototype {
}
