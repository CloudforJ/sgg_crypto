package com.atguigu.desaes;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class AesDemo {
    public static void main(String[] args) throws Exception {
        // 原文
        String input = "硅谷";
        // 密钥
        // AES的密钥必须16个字节
        String key = "1234567812345678";
        // 加密算法
        String transformation = "AES";
        // 加密类型
        String type = "AES";
        // 创建加密对象
        String ciphertext = encryptedAES(input, key, type);
        System.out.println(ciphertext);
//        for (byte aByte : bytes) {
//            System.out.println(aByte);
//        }
//        System.out.println(new String(bytes));
        String plaintext = decryptedAES(ciphertext, key, type);
        System.out.println(plaintext);
    }

    private static String decryptedAES(String encryptedMsg, String key, String type) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher cipher = Cipher.getInstance(type);
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), type);
        // 第一个参数表示解密
        // 第二个参数表示解密规则
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
        byte[] bytes = cipher.doFinal(Base64.getDecoder().decode(encryptedMsg));
        // 需要使用new String(bytes)
        // 不能使用bytes.toString()
        return new String(bytes);
    }

    private static String encryptedAES(String input, String key, String type) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher cipher = Cipher.getInstance(type);
        // 第一个参数表示key的字节
        // 第二个参数表示加密的类型
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), type);
        // 进行加密初始化
        // 第一个参数表示模式，加密模式和解密模式
        // 第二个参数表示加密规则
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        // 调用加密算法，参数表示原文的字节数组
        byte[] bytes = cipher.doFinal(input.getBytes());
        // 创建base64对象

        String encode = Base64.getEncoder().encodeToString(bytes);
        return encode;

    }
}
