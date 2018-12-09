package com.example.designpattern.structural.bridge;

/**
 * @Author: suxun
 * @Date: 2018/12/9 10:58
 * @Description:
 */
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行");
        return account;
    }
}
