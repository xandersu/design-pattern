package com.example.designpattern.structural.proxy.db;

/**
 * @Author: suxun
 * @Date: 2018/12/9 12:05
 * @Description:
 */
public class DataContextHolder {
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    public static void setDBType(String dbType) {
        CONTEXT_HOLDER.set(dbType);
    }

    public static String getDBType() {
        return CONTEXT_HOLDER.get();
    }

    public static void clearDBType() {
        CONTEXT_HOLDER.remove();
    }
}
