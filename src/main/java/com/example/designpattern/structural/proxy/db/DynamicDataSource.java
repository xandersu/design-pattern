package com.example.designpattern.structural.proxy.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Author: suxun
 * @Date: 2018/12/9 12:04
 * @Description:
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataContextHolder.getDBType();
    }
}
