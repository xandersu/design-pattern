package com.example.designpattern.structural.adapter;

/**
 * @Author: suxun
 * @Date: 2018/12/2 19:48
 * @Description:
 */
public class PowerAdapter implements DC5 {
    private AC220 ac220 = new AC220();

    @Override
    public int output5V() {
        int adapterInput = ac220.outputAC220();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用power输入AC:" + adapterOutput + "输出" + adapterInput);
        return adapterOutput;
    }
}
