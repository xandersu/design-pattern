package com.example.designpattern.creational.prototype;

import java.text.MessageFormat;

/**
 * @Author: suxun
 * @Date: 2018/12/2 17:01
 * @Description:
 */
public class MailUtil {
    public static void sendMail(Mail mail) {
        String outCountent = "想{0}同学，邮件地址：{1}，邮件内容：{2}，发送成功";
        System.out.println(MessageFormat.format(outCountent, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    public static void saveOriginalMailRecord(Mail mail) {
        System.out.println("存储original记录，内容：" + mail.getContent());
    }
}
