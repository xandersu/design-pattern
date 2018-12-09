package com.example.designpattern.structural.bridge;

/**
 * @Author: suxun
 * @Date: 2018/12/9 11:02
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        ICBCBank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();


    }
}
