package com.example.designpattern.structural.bridge;

/**
 * @Author: suxun
 * @Date: 2018/12/9 10:54
 * @Description:
 */
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("活期账号");
    }
}
