package com.example.designpattern.structural.adapter.adapter20200510;

/**
 * @author su
 * @date 2020/5/1010:43
 * @description
 */
public class Test {
    public static void main(String[] args) {
        AC110V ac110V = new AC110V();
        AC220V ac220V = new AC220V();

        Adapter adapter = new Adapter();
        adapter.charge(ac110V);
        adapter.charge(ac220V);
    }
}
