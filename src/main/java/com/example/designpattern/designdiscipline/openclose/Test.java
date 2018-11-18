package com.example.designpattern.designdiscipline.openclose;

/**
 * Created by lenovo on 2018/11/19.
 * 在用IDEA debug调试的时候，当需要动态查看某一个值的时候，就需要用到计算表达式窗口
 * 当debug选中某一行的时候，按快捷键 Alt + F8 就可以打开Evaluate Expression计算表达式窗口
 */
public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaCourse(96, "123", 348d);
        JavaDiscountCourse javaDiscountCourse = new JavaDiscountCourse(96, "123", 348d);
        //System.out有锁
        System.out.println(javaCourse);
        System.out.println(javaDiscountCourse);
        System.out.println(javaDiscountCourse.getId()+" "+ javaDiscountCourse.getName()+" "+ javaDiscountCourse.getPrice());
    }
}
