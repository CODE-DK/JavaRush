package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(bufferedReader.readLine());
        FileWriter fileWriter = new FileWriter(bufferedReader.readLine());
        bufferedReader.close();

        while (fileReader.ready()){
            int a = fileReader.read();
            int b = fileReader.read();
            fileWriter.write(b);
        }

        fileReader.close();
        fileWriter.close();
    }
}
