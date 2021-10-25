package com.atguigu.ascii;

public class AsciiDemo {
    public static void main(String[] args) {
//        char a = 'a';
//        int b = a;

        String a = "Azb";

        char[] chars = a.toCharArray();
        for (char c : chars) {
            int b = c;
            System.out.println(b);
        }
//        System.out.println(b);
    }
}
