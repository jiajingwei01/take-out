package com.sasa.test;


import com.sasa.utils.JwtUtil;
import io.jsonwebtoken.Claims;
import org.junit.Test;

public class JwtTest {

    @Test
    public void testJwtParse() throws InterruptedException {
        System.out.println("Hello world!");

        String wangToken = JwtUtil.generateToken("小王",18L);

        for (int i = 0; i < 10; i++) {
            Claims claims = JwtUtil.validateTokenMy(wangToken);
//            System.out.println("解析成功：" + claims);
            String username = claims.get("username", String.class);
            Long id = claims.get("id", Long.class);
            System.out.println("解析成功：username：" + username + ", id：" + id);
            Thread.sleep(2000);
        }
    }
}
