package com.example.designpattern.designdiscipline.openclose;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by lenovo on 2018/11/19.
 * java课程
 */
@Data
//@ToString
@NoArgsConstructor
@AllArgsConstructor
public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private Double price;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "JavaCourse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
