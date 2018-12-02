package com.example.designpattern.creational.prototype;

import lombok.Data;
import lombok.ToString;

import java.util.Map;

/**
 * @Author: suxun
 * @Date: 2018/12/2 17:00
 * @Description:
 */
@Data
public class Mail implements Cloneable {

    private String name;
    private String emailAddress;
    private String content;

    public Mail() {
        System.out.println("mail class Constructor");
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", content='" + content + '\'' +
                '}' + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail object");
        return super.clone();
    }
}
