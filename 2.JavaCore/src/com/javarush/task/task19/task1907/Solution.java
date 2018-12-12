package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

        int count = 0;
        while (fileReader.ready()) {
            String s = fileReader.readLine();
            String[] stringBuffer = s.split("\\W");
            for (int i = 0; i < stringBuffer.length; i++) {
                if (stringBuffer[i].equals("world")){
                    count ++;
                }
            }
        }
        System.out.println(count);
        fileReader.close();
    }
}
