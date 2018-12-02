package com.example.designpattern.creational.prototype.clone;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @Author: suxun
 * @Date: 2018/12/2 17:22
 * @Description:
 */
@Data
public class Pig implements Cloneable {
    private String name;
    private Date birthday;

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}' + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();
        pig.birthday = (Date) pig.birthday.clone();
        return pig;
    }
}
