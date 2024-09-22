package com.kototo.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class RedisTest {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test() {
        redisTemplate.opsForValue().set("k1","v1");
        Object k1 = redisTemplate.opsForValue().get("k1");
        System.out.println("k1 = " + k1);

        List list = new ArrayList<>();
        list.add("luck");
        list.add("toto");
        redisTemplate.opsForValue().set("abc",list);
        System.out.println("list = " + list);

        redisTemplate.opsForList().leftPush("names", "大大");
        redisTemplate.opsForList().leftPush("names", "小小");
        redisTemplate.opsForList().leftPush("names", "中中");
    }
}
