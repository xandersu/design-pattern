package com.example.designpattern.structural.proxy;

import lombok.Data;
import lombok.ToString;

/**
 * @Author: suxun
 * @Date: 2018/12/9 11:40
 * @Description:
 */
@Data
@ToString
public class Order {
    private Object orderInfo;
    private Integer userId;
}
