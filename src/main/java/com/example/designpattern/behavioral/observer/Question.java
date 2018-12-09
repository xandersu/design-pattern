package com.example.designpattern.behavioral.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author: suxun
 * @Date: 2018/12/9 16:50
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Question {
    private String userName;
    private String questionContent;

}
