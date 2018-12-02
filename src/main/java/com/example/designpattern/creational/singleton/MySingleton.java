package com.example.designpattern.creational.singleton;

/**
 * @Author: suxun
 * @Date: 2018/12/2 14:40
 * @Description: 单例模式
 * 保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 * 创建型
 * 使用场景
 * 想要确保任何情况下都绝对只有一个实例
 * 优点：
 * 在内存中只有一个实例，减少内存开销
 * 可以避免对资源的多重占用
 * 设置全局访问点，严格控制访问
 * 缺点：
 * 没有接口，扩展困难
 * 重点：
 * 私有构造器
 * 线程安全
 * 延迟加载
 * 序列化和反序列化安全
 * 反射-防止反射攻击
 * 相关设计模式
 * 工厂模式，享元模式
 */
public class MySingleton {
}
