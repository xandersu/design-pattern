package com.example.designpattern.creational.singleton;


import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: suxun
 * @Date: 2018/12/2 16:14
 * @Description: 容器单例
 */
public class ContainerSingleton {
    private static Map<String, Object> singletonMap = new HashMap<>();

    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNotBlank(key) && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
