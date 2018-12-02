package com.example.designpattern.creational.abstract_factory;

/**
 * @Author: suxun
 * @Date: 2018/12/2 11:25
 * @Description: 抽象工厂模式（针对产品族）
 * 提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 * 创建型
 * 场景：
 * 客户端（应用层）不依赖于产品类实例如何被创建、实现等细节
 * 强调一系列相关的产品对象一起使用创建对象需要大量重复的代码
 * 提供一个产品类的库，所有的产品以同样的接口出现，从而使客户端不依赖于具体的实现
 * 优点：
 * 具体产品在应用层代码隔离，无须关心创建细节
 * 将一个系列的产品族统一到一起创建
 * 缺点：
 * 规定了所有可能创建的产品集合，产品中扩展新的产品困难，需要修改抽象工厂的接口
 * 增加了系统的抽象性和理解难度
 *
 */
public interface AbstractFactory {
}
