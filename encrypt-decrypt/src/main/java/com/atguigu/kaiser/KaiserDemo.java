package com.atguigu.kaiser;

public class KaiserDemo {
    public static void main(String[] args) {
        String input = "Hello World";
        // 右移三位
        int key = 3;
        String ciphertext = encrypted(input, key);
        System.out.println("密文是： " + ciphertext);
        String plaintext = decrypted(ciphertext, key);
        System.out.println("明文是： " + plaintext);
    }

    private static String decrypted(String input, int key) {
        char[] chars = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            int b = c;
            b -= key;
            char newChar = (char) b;
            sb.append(newChar);
        }
        return sb.toString();
    }

    private static String encrypted(String input, int key) {
        char[] chars = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            int b = c;
            b += key;
            char newChar = (char) b;
            sb.append(newChar);
        }
        return sb.toString();
    }
}
