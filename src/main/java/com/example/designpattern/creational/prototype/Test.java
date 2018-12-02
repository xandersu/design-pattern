package com.example.designpattern.creational.prototype;

import sun.text.resources.cldr.ti.FormatData_ti;

/**
 * @Author: suxun
 * @Date: 2018/12/2 17:04
 * @Description:
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Mail mail = new Mail();
        mail.setContent("初始化模版");
        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名" + i);
            mailTemp.setEmailAddress(i + "@xxx.com");
            mailTemp.setContent("yes!");
            MailUtil.sendMail(mailTemp);
        }
        MailUtil.saveOriginalMailRecord(mail);
    }
}
