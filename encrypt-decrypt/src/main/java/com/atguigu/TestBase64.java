package com.atguigu;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class TestBase64 {
    public static void main(String[] args) {
        // 1表示一个字节
        // 不够三个字节
        // 不够三个字节需要使用=进行补齐
        System.out.println(Base64.getEncoder().encodeToString("1".getBytes(StandardCharsets.UTF_8)));
        System.out.println(Base64.getEncoder().encodeToString("12".getBytes(StandardCharsets.UTF_8)));
        System.out.println(Base64.getEncoder().encodeToString("123".getBytes(StandardCharsets.UTF_8)));
        System.out.println(Base64.getEncoder().encodeToString("硅谷".getBytes(StandardCharsets.UTF_8)));
    }
}
