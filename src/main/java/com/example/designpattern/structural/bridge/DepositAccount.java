package com.example.designpattern.structural.bridge;

/**
 * @Author: suxun
 * @Date: 2018/12/9 10:53
 * @Description:
 */
public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("打开定期账号");
    }
}
