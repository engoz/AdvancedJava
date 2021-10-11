package com.jasypt;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;


public class EncryptionDecryptionUsingJASYPT {
    public static void main(String[] args) {


           StandardPBEStringEncryptor s_encryptor = new StandardPBEStringEncryptor();
            s_encryptor.setAlgorithm("PBEWithMD5AndDES");
            s_encryptor.setPassword("password");
            String encrypt = s_encryptor.encrypt("Sv567890!@");
            System.out.println(encrypt);
            String decrypt = s_encryptor.decrypt("tSnq9UZCUUwK+TEN7NWTh2wzn37EqI5/");
            System.out.println(decrypt);
    }
}
