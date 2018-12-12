package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(bufferedReader.readLine()));

        while(true)
        {
            String a = bufferedReader.readLine();
            bufferedWriter.write(a);
            bufferedWriter.newLine();
            if (a.equals("exit")) break;
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
