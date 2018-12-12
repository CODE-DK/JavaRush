package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* 
Генератор паролей
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream password = getPassword();
        byte[] pass = getPassword().toByteArray();
        System.out.println(password.toString());
//        for (byte b : pass) {
//            System.out.print((char) b + " ");
//        }
//        (int) (Math.random() * 10) + 10 генератор в диапазоне 10 - 20
//        for (int i = 0; i < 3; i++) {
//            System.out.print((char)((Math.random() * 26) + 65)); // строчные буквы
//            System.out.print((char)((Math.random() * 26) + 97)); // прописные буквы
//            System.out.print((char)((Math.random() * 10) + 48)); // цыфры
//        }
//        System.out.print((char)((Math.random() * 10) + 48)); // цыфры
    }

    public static ByteArrayOutputStream getPassword() throws IOException {
        byte[]bytes = new byte[8];
        bytes[0] = (byte) ((Math.random() * 26) + 65);
        bytes[1] = (byte) ((Math.random() * 26) + 97);
        bytes[2] = (byte) ((Math.random() * 10) + 48);
        bytes[3] = (byte) ((Math.random() * 26) + 97);
        bytes[4] = (byte) ((Math.random() * 26) + 65);
        bytes[5] = (byte) ((Math.random() * 10) + 48);
        bytes[6] = (byte) ((Math.random() * 26) + 97);
        bytes[7] = (byte) ((Math.random() * 10) + 48);
        try(ByteArrayOutputStream stream = new ByteArrayOutputStream()){
            stream.write(bytes);
            return stream;
        }
    }
}