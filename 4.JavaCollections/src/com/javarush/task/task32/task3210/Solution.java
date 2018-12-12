package com.javarush.task.task32.task3210;

import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String[] args) {
        String fileName = args[0];
        long number = Long.parseLong(args[1]);
        String text = args[2];

        try (RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "rw")) {
            byte[] array = new byte[text.length()];
            randomAccessFile.seek(number);
            randomAccessFile.read(array, 0, array.length);
            String newText = convertByteToString(array);
            randomAccessFile.seek(randomAccessFile.length());

            if (text.equals(newText)) {
                randomAccessFile.write("true".getBytes());
            } else {
                randomAccessFile.write("false".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String convertByteToString(byte readBytes[]){
        return new String(readBytes);
    }
}
