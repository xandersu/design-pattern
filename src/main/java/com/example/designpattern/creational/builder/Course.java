package com.example.designpattern.creational.builder;

import lombok.Data;
import lombok.ToString;

/**
 * @Author: suxun
 * @Date: 2018/12/2 13:08
 * @Description:
 */
@Data
@ToString
public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    private String courseQA;

}
