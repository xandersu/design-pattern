package com.example.designpattern.creational.builder;

/**
 * @Author: suxun
 * @Date: 2018/12/2 12:48
 * @Description: 建造者模式
 * 将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
 * 用户只需指定需要建造的类型就可以得到他们，建造过程和细节不需要知道
 * 场景：
 * 如果一个对象有非常复杂的内部结构
 * 想把复杂对象的创建和使用分离
 * 优点：
 * 封装性好，创建和使用分离
 * 扩展性好、建造类之间独立、一定程度上解耦
 * 缺点：
 * 产生多余的builder对象
 * 产品内部发生变化，建造者都要修改，成本大
 *
 */
public interface MyBuilder {
}
