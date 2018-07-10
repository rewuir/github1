package com.example.redisdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 学习
 */
@RestController
@RequestMapping(value = "/cache")
public class TestController {

    @Autowired
    private RedisManager redisManager;

    /**
     * Key
     */
    private final static String TEST_KEY = "testKey";

    @GetMapping(value = "/put")
    public String put(){
        redisManager.set(TEST_KEY,"2eshbe");

        return "0";
    }
    @GetMapping(value = "/show")
    public String show(){
        Object o = redisManager.get(TEST_KEY);
        return o.toString();
    }

}
