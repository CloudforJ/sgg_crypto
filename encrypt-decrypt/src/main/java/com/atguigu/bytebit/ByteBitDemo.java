package com.atguigu.bytebit;

public class ByteBitDemo {
    public static void main(String[] args) throws Exception {
        /**
         * utf-8 一个中文对应三个字节
         * GBK 一个中文对应两个字节
         *
         */
        String a = "尚";
        /**
         * 可以接受参数，默认是UTF-8
         */
        byte[] bytes = a.getBytes("GBK");
        for (byte aByte : bytes) {
            System.out.println(aByte);
            String s = Integer.toBinaryString(aByte);
            System.out.println(s);
        }
    }
}
