package com.jasypt;

import org.jasypt.util.text.AES256TextEncryptor;

public class EncryptionDecryptionUsingJASYPT {
    public static void main(String[] args) {
        AES256TextEncryptor textEncryptor = new AES256TextEncryptor();
        String plainText = textEncryptor.decrypt("ksc4FKp6jd6Djad5nDw8s34tl7Lp7hWq");
        System.out.println(plainText);
    }
}
