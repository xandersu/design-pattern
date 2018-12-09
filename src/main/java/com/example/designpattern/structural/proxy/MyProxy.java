package com.example.designpattern.structural.proxy;

/**
 * @Author: suxun
 * @Date: 2018/12/9 11:29
 * @Description: 代理模式
 * 为其他对象提供一种代理以控制对这个对象的访问。
 * 代理对象在客户端和目标对象之间起到中介的作用
 * 使用场景
 * 保护目标对象
 * 增强目标对象
 * 优点：
 * 将代理对象与真实被调用的目标对象分离
 * 一定程度上降低了系统的耦合度，扩展性好
 * 保护目标对象
 * 缺点：
 * 类数目增加
 * 处理速度变慢
 * 增加复杂度
 * 扩展：
 * 静态代理
 * 动态代理
 * cglib代理
 * spring代理选择：bean有接口 jdk；没有接口，使用cglib；强制使用cglib
 * cglib asm字节码生成
 * jdk 7,8快20%
 * 相关设计模式
 * 装饰者
 * 适配器
 *
 */
public interface MyProxy {

}
