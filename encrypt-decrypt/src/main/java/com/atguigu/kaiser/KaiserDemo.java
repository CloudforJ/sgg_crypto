package com.atguigu.kaiser;

public class KaiserDemo {
    public static void main(String[] args) {
        String input = "Hello World";
        // 右移三位
        int key = 3;
        char[] chars = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            int b = c;
            b += key;
            char newChar = (char) b;
            sb.append(newChar);
        }
        System.out.println(sb.toString());
    }
}
