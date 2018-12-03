package com.example.designpattern.structural.composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author: suxun
 * @Date: 2018/12/3 22:18
 * @Description:
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Course extends CatalogComponent {
    private String name;
    private double price;

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}
