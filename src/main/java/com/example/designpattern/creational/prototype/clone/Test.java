package com.example.designpattern.creational.prototype.clone;

import java.util.Date;

/**
 * @Author: suxun
 * @Date: 2018/12/2 17:23
 * @Description:
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(0L);
        Pig pig = new Pig();
        pig.setName("a");
        pig.setBirthday(date);
        Pig pc = (Pig) pig.clone();
        System.out.println(pig);
        System.out.println(pc);

        pig.getBirthday().setTime(6666666L);
        System.out.println(pig);
        System.out.println(pc);
    }
}
