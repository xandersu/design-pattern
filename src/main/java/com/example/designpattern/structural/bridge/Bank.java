package com.example.designpattern.structural.bridge;

/**
 * @Author: suxun
 * @Date: 2018/12/9 10:56
 * @Description:
 */
public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
