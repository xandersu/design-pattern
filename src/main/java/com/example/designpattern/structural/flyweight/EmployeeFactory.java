package com.example.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: suxun
 * @Date: 2018/12/3 21:47
 * @Description:
 */
public class EmployeeFactory {
    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String dept) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(dept);
        if (manager == null) {
            manager = new Manager(dept);
            System.out.println("创建部门经理:" + dept);
            String reportContent = dept + ": 部门汇报";
            manager.setReportContent(reportContent);
            System.out.println("报告内容：" + reportContent);
            EMPLOYEE_MAP.put(dept, manager);
        }
        return manager;
    }
}
