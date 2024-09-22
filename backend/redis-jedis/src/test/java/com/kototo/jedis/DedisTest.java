package com.kototo.jedis;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

public class DedisTest {

    Jedis jedis = null;
    @BeforeEach
    public void init() {
        jedis = new Jedis("192.168.80.100",6379);
    }
    @AfterEach
    public void close() {
        if(jedis != null) {
            jedis.close();
        }
    }
    @Test
    public void testset() {
        jedis.set("aa", "bb");
        String aa = jedis.get("aa");
        System.out.println("aa = " + aa);
    }


    @Test
    public void testConnect() {
        Jedis jedis = new Jedis("192.168.80.100",6379);
        String pong = jedis.ping();
        System.out.println("pong = " + pong);
        jedis.close();
    }
}
