package com.example.redisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class RedisdemoApplication {


    /**
     * 启动redis缓存
     * 1.建立连接
     * 2.实现相关方法（放缓存，取缓存，删除，过期）
     *
     * 3.取值，根据泛型判断相关方法取值（Object，String，List）
     * 4.根据模糊key取值
     *
     *
     * redis 缓存方式分2种
     * 1）自己连接
     * 2）使用springboot缓存，更新，查找后自动建立缓存
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(RedisdemoApplication.class, args);
    }
}
