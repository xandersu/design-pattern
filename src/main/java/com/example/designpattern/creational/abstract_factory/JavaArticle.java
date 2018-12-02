package com.example.designpattern.creational.abstract_factory;

/**
 * @Author: suxun
 * @Date: 2018/12/2 12:09
 * @Description:
 */
public class JavaArticle extends Article {

    @Override
    public void produce() {
        System.out.println("录制Java手记。");
    }
}
