package com.kototo.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.RedisScript;

import java.util.Collections;
import java.util.List;

@SpringBootTest
public class LuaTest {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private RedisScript<Boolean> script;

    @Test
    public void test() {
        boolean b = checkAndSet("k1","vv1", "aaa");
        System.out.println(b?"修改成功":"修改失败");

        redisTemplate.opsForValue().set("k2","v2");
        boolean b1 = checkAndSet("k2", "v2", "vv2");
        System.out.println(b1?"success":"NNNOOOOO!");
    }

    private boolean checkAndSet(String key,String value1,String value2) {
        List<String> keyList = Collections.singletonList(key);
        return redisTemplate.execute(script, keyList, value1,value2);
    }
}
