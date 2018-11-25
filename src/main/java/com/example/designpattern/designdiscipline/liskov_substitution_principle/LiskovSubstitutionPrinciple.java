package com.example.designpattern.designdiscipline.liskov_substitution_principle;

/**
 * @Author: suxun
 * @Date: 2018/11/25 15:43
 * @Description: 里氏替换原则
 * 定义 继承必须确保超类所拥有的性质在子类中仍然成立。
 * 第一种定义，也是最正宗的定义：If for each object o1 of type S there is an object o2 of type T such that for all programs P defined in terms of T,the behavior of P is unchanged when o1 is substituted for o2 then S is a subtype of T.
 * 如果对每一个类型为S的对象o1，都有类型为T的对象o2，使得以T定义的所有程序P在所有的对象o1都代换成o2时，程序P的行为没有发生变化，那么类型S是类型T的子类型。
 * 第二种定义：Functions that use pointers or references to base classes must be able to useobjects of derived classes without knowing it.
 * 所有引用基类的地方必须能透明地使用其子类的对象。只要有父类出现的地方，都可以用子类来替代。
 * ·
 * 体现在四个方面：
 * 1、子类必须实现父类的抽象方法，但不得重写（覆盖）父类的非抽象（已实现）方法。
 * 2、子类中可以增加自己特有的方法。
 * 3、当子类覆盖或实现父类的方法时，方法的前置条件（即方法的形参）要比父类方法的输入参数更宽松。
 * 4、当子类的方法实现父类的抽象方法时，方法的后置条件（即方法的返回值）要比父类更严格。
 * ·
 * 优点1：约束继承泛滥，开闭原则的一种体现
 * 优点2：加强健壮性，变更时做到更好的兼容性，提高程序的维护性、扩展性。降低需求变更时引入的风险。
 */
public interface LiskovSubstitutionPrinciple {
}
