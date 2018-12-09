package com.example.designpattern.behavioral.iterator;

/**
 * @Author: suxun
 * @Date: 2018/12/9 15:41
 * @Description: 提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
 * 行为型
 * 使用场景：
 * 访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
 * 为遍历不同的集合结构提供一个统一的接口
 * 优点：
 * 分离了集合对象的遍历行为
 * 缺点：
 * 类的个数成对增加
 * 相关设计模式：
 * 访问者模式：
 */
public interface MyIterator {
}
