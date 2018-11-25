package com.example.designpattern.designdiscipline.liskov_substitution_principle;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: suxun
 * @Date: 2018/11/25 21:00
 * @Description:
 */
public class Son extends Father {

    public void  test1(HashMap map){
        System.out.println("子类执行");
    }
}
