package com.example.designpattern.designdiscipline.singleresponsibility;

/**
 * @Author: suxun
 * @Date: 2018/11/19 22:55
 * @Description:
 */
public class Method {
    private void updateUserInfo(String userName, String address) {
        userName = "geely";
        address = "beijing";
    }

    private void updateUserInfo(String userName, String... properties) {
        userName = "geely";
    }

    private void updateUserName(String userName) {
        userName = "geely";
    }

    private void updateAddress(String address) {
        address = "beijing";
    }

    private void updateUserInfo(String userName, String address, boolean b) {
        //应该拆开两个方法，实际上是两个功能，做1和做2
        if (b) {
            //do 1
        } else {
            //do 2
        }
    }
}
