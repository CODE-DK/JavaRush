package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = bufferedReader.readLine();
        String secondFileName = bufferedReader.readLine();
        bufferedReader.close();


//        String firstFileName = "C:\\Users\\DMITRIY\\Desktop\\input.txt";
//        String secondFileName = "C:\\Users\\DMITRIY\\Desktop\\output.txt";

        FileInputStream fileInputStream = new FileInputStream(firstFileName);
        FileOutputStream fileOutputStream = new FileOutputStream(secondFileName);

        byte[] bytes = new byte[1000];
        while(fileInputStream.available() > 0){
            int a = fileInputStream.read(bytes);
            byte[] bytes1 = new byte[a];
            for (int i = 0; i < a; i++) {
                bytes1[a - i - 1] = bytes[i];
            }
            fileOutputStream.write(bytes1);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
