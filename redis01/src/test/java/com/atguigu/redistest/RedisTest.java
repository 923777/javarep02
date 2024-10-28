package com.atguigu.redistest;

import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

public class RedisTest {
    @Test
    public void  test01(){
        Jedis jedis = new Jedis("192.168.123.100",6379);
        System.out.println(jedis.ping());
    }
}
