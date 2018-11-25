package com.example.designpattern.designdiscipline.liskov_substitution_principle;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: suxun
 * @Date: 2018/11/25 21:01
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Son son = new Son();
        HashMap<Object, Object> map1 = new HashMap<>();
        Map<Object, Object> map2 = new HashMap<>();
        son.test1(map1);
        son.test1(map2);
    }
}
