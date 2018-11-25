package com.example.designpattern.creational.simple_factory_pattern;

/**
 * @Author: suxun
 * @Date: 2018/11/25 21:35
 * @Description: 简单工厂模式
 * 创建型,又叫做静态工厂方法（Static Factory Method）模式，但不属于23种GOF设计模式之一。
 * 简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。
 * 简单工厂模式是工厂模式家族中最简单实用的模式，可以理解为是不同工厂模式的一个特殊实现。
 * 适用场景：
 * 工厂类负责创建的对象比较少。
 * 客户端(应用层)只知道传入工厂类的参数，对于如何创建对象(逻辑)不关心
 * 优点：
 * 只需要一个正确的参数，就可以获取所需对象，而无需知道其创建的细节。
 * 缺点：
 * 工厂类职责相对过重，增加新产品，需要修改工厂类的判断逻辑，违背开闭原则
 */
public interface SimpleFactoryPattern {
}
