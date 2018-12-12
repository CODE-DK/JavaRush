package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isExit = false;

        while (!isExit){
            String fileName = reader.readLine();
            try{
                FileInputStream inputStream = new FileInputStream(fileName);
                inputStream.close();

            }catch (FileNotFoundException e){
                isExit = true;
                System.out.println(fileName);
            }
        }
        reader.close();
    }
}
