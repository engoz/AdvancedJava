package com.encript;

import java.util.Random;

public class UnbreakableEncrryption {

    public static void main(String[] args) {
        KeyPair kp = encrypt("Engin Öz");
        String result = decrypt(kp);
        System.out.println(result);
    }

    public static KeyPair encrypt(String original){
        byte[] originalBytes  = original.getBytes();
        byte[] dummyKey = randomKey(originalBytes.length);
        byte[] encryptKey = new byte[originalBytes.length];
        for (int i=0; i< originalBytes.length; i++){
            //XOR everybyte
            encryptKey[i] = (byte) (originalBytes[i] ^ dummyKey[i]);
        }
        return new KeyPair(dummyKey,encryptKey);
    }

    public static String decrypt(KeyPair kp){
        byte[] decrypt = new byte[kp.key1.length];
        for (int i= 0; i<decrypt.length; i++){
            //XOR everybyte
            decrypt[i] = (byte) (kp.key1[i] ^ kp.key2[i]);
        }
        return new String(decrypt);
    }

    public static byte[] randomKey(int length){
        byte[] dummy = new byte[length];
        Random random = new Random();
        random.nextBytes(dummy);
        return dummy;
    }
}
