package com.example.designpattern.structural.flyweight;

/**
 * @Author: suxun
 * @Date: 2018/12/3 21:45
 * @Description:
 */
public class Manager implements Employee {

    @Override
    public void report() {
        System.out.println(reportContent);
    }

    private String dept;
    private String reportContent;

    public Manager(String dept) {
        this.dept = dept;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
