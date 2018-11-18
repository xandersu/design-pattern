package com.example.designpattern.designdiscipline.openclose;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by lenovo on 2018/11/19.
 * java打折课程
 */
@Data
@NoArgsConstructor
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
