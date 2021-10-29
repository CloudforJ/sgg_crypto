package com.atguigu;

import java.util.Base64;

public class TestString {
    public static void main(String[] args) {
        String str = "TU0jv0xBTi==";
        String str1 = new String(Base64.getDecoder().decode(str));
        System.out.println(str1);
        String str2 = Base64.getDecoder().decode(str).toString();
        System.out.println(str2);
    }
}
