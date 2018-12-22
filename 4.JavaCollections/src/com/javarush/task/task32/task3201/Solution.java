package com.javarush.task.task32.task3201;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
Запись в существующий файл
*/
public class Solution {
    public static void main(String... args) {
        File fileName = new File(args[0]);
        long number = Long.parseLong(args[1]);
        String text = args[2];
        byte[] array = text.getBytes();

        try (RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "rw")) {

            if (randomAccessFile.length() < number){
                number = randomAccessFile.length();
            }
            randomAccessFile.seek(number);
            randomAccessFile.write(array);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
