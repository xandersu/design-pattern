package com.example.designpattern.behavioral.ChainofResponsibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author: suxun
 * @Date: 2018/12/9 18:17
 * @Description:
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Course  {
    private String name;
    private String article;
    private String video;
}
