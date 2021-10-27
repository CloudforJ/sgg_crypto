package com.atguigu.bytebit;

public class ByteBit {
    public static void main(String[] args) {
        String a = "a";
        byte[] bytes = a.getBytes();
        for (byte aByte : bytes) {
            int c = aByte;
            System.out.println(c);
            String s = Integer.toBinaryString(c);
            System.out.println(s);
        }
    }
}
