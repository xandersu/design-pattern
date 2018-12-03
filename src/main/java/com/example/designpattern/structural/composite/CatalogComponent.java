package com.example.designpattern.structural.composite;

/**
 * @Author: suxun
 * @Date: 2018/12/3 22:15
 * @Description:
 */
public abstract class CatalogComponent {

    public void add(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持添加");
    }

    public void remove(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持删除");
    }

    public String  getName(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持获取名字");
    }
    public double getPrice(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持获取价格");
    }

    public void print() {
        throw new UnsupportedOperationException("不支持获取打印");
    }
}
